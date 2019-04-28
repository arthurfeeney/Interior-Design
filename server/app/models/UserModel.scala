package models

import scala.collection.mutable
import slick.jdbc.MySQLProfile.api._
import scala.concurrent.duration.Duration
import scala.concurrent.Await
import scala.concurrent.Future
import Tables._
import scala.concurrent.ExecutionContext
//case class User(id: Int, name: String, username: String, pw: String, email: String,phone: Int)

object UserModel {
  var users = mutable.Map[String, String]()                    // Username -> password
  var tasks = mutable.Map[String, mutable.Seq[Seq[String]]]()  // Username -> tasks
  var admin = mutable.Buffer[String]()                         // Usernames of the admin

  // when a new user has been created.
  def addUser(username: String,
   pw: String,db: Database)  = {
  //  if(!checkName(name)) {
      users(name) = pw
      tasks(name) = mutable.Seq[Seq[String]]() // users tasks are initially empty.
  //  }
  }

  // checks if name is already used
  def checkName(username:String, db: Database): Future[Option[Int]] = {
    db.run {
      val ids = for {
        u <- User
        if u.username === username
      }
      yield {u.id}
    ids.result.headOption
    }
  }

  // checks if password is correct
  def checkPassword(name: String, pw: String): Boolean = {
    return users.contains(name) && users(name) == pw
  }

  // returns the tasks of a user.
  def getTasks(name:String): Seq[Seq[String]] = {
  //  if(checkName(name)) {
      tasks(name)



//    }
//    else {
//      Seq(Seq())
//    }
  }

  def addTask(name: String, comps: String*): Boolean = {
    println(comps)

  //  if(checkName(name)) {
  //    tasks(name) :+= comps // append task to the user's tasks
      return true
  //  }
  //  return false
  }

  def removeTask(name:String, taskid: Int) = {
    tasks(name) = tasks(name).zipWithIndex.filter(_._2 != taskid-1).map(_._1)
  }

  def clearModel() {
    users.clear()     // Username -> password
    tasks.clear()  // Username -> tasks
  }

}
