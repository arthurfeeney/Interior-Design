package models

import scala.collection.mutable
import slick.jdbc.MySQLProfile.api._
import scala.concurrent.duration.Duration
import scala.concurrent.Await
import scala.concurrent.Future
import Tables._
import scala.concurrent.ExecutionContext

object UserModel {
  // when a new user has been created.
  def addUser(username: String, pw: String,db: Database)(implicit ec: ExecutionContext): Unit  = {
    val checkResult = Await.result(checkName(username, db), Duration.Inf)
    if(!checkResult.isEmpty) {
      println("This user already exists.")
    }
    else {
      Await.result(db.run(UserTemporary+=UserTemporaryRow(0,username, pw)), Duration.Inf)
    }
  }
  
  def removeUser(uid: Int, db: Database)(ec: ExecutionContext): Unit = {
    val u = UserTemporary.filter(_.id === uid)
    Await.result(db.run(u.delete), Duration.Inf)
  }

  // checks if name is already used
  def checkName(username:String, db: Database): Future[Option[Int]] = {
    /*
     * Returns the users id if it exists.
     */
    db.run {
      val ids = for {
        u <- UserTemporary
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
        u <- UserTemporary
        if u.username === username && u.password === pw
      }
      yield {u.id}
    ids.result.headOption
    }
  }
}
