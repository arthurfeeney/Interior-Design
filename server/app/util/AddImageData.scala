package util
import slick.jdbc.MySQLProfile.api._
import java.util.concurrent.ConcurrentHashMap
import scala.concurrent.duration.Duration
import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import models._
import Tables._
object AddImageData extends App {
  val db = Database.forURL("jdbc:mysql://localhost/interior?user=interior&password=DesignThisSite&nullNamePatternMatchesAll=true&serverTimezone=UTC",
      user="interior", password="DesignThisSite", driver="com.mysql.cj.jdbc.Driver")
  Await.result(db.run(Image.delete), Duration.Inf)
  Await.result(db.run(sqlu"ALTER TABLE image AUTO_INCREMENT = 1;"), Duration.Inf)
  Await.result(db.run(
    Image ++=Seq(     
      ImageRow(0,"/versionedAssets/images/325Library.jpg", None, 0, 0),
      ImageRow(0, "/versionedAssets/images/325living.jpg", None, 0, 1),
      ImageRow(0,"/versionedAssets/images/325livingWindow.jpg", None, 0, 2),
      ImageRow(0, "/versionedAssets/images/325Master.jpg", None, 0,3),
      ImageRow(0, "/versionedAssets/images/325sitting.jpg", None, 1, 0),
      ImageRow(0, "/versionedAssets/images/3living.jpg", None, 1, 1),
      ImageRow(0, "/versionedAssets/images/441living.jpg", None, 1, 2),
      ImageRow(0, "/versionedAssets/images/441master.jpg", None, 1, 3),
      ImageRow(0, "/versionedAssets/images/441study.jpg", None, 2, 0)
  )), Duration.Inf)
  db.close()
}