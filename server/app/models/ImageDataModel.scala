package models
import slick.jdbc.MySQLProfile.api._
import scala.concurrent.duration.Duration
import scala.concurrent.Await
import scala.concurrent.Future
import Tables._
import scala.concurrent.ExecutionContext
object ImageDataModel {
  
  def images(db: Database): Future[Seq[ImageRow]] = {
    db.run {
      (for (i <- Image) yield i).result
    }
  }
  def getByDesc(desc: String, db:Database): Future[Seq[ImageRow]] = {
    db.run {
      (for (
          i <- Image
          if i.description === desc
          ) yield i).result
    }
  }
  
  def addImage(link: String, desc: String, col: Int, row: Int, db: Database): Unit = {
    Await.result(db.run(Image+=ImageRow(0, link, desc, col, row)), Duration.Inf)
  }
  
  def removeImage(id: Int, db: Database): Unit = {
    val img = Image.filter(_.id === id)
    Await.result(db.run(img.delete), Duration.Inf)
  }
  
  
  
}