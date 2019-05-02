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
  //ar users = mutable.Map[String, String]()                    // Username -> password
 // var tasks = mutable.Map[String, mutable.Seq[Seq[String]]]()  // Username -> tasks
 // var admin = mutable.Buffer[String]()                         // Usernames of the admin

  // when a new user has been created.
  def addUser(username: String,
   pw: String,db: Database)(implicit ec: ExecutionContext): Unit  = {
     val checkResult = Await.result(checkName(username, db), Duration.Inf)
     if(checkResult.isEmpty) {
      println("This user already exists.")
    }
     else {
       Await.result(db.run(UserTemporary+=UserTemporaryRow(0,username, pw)), Duration.Inf)
     }
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
  def checkPassword(username: String, pw: String, db: Database): Future[Option[Int]] = {
    db.run {
      val ids = for {
        u <- User
        if u.username === username && u.password === pw
      }
      yield {u.id}
    ids.result.headOption
    }
  }
/*
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
  * 
  */

}
