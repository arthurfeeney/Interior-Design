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
      
  val absPath   = "/versionedAssets/images/"
  //println(System.getProperty("user.dir"))
  val addiFolder = "pic for website/"
  
  val addiImages = Array("325Library.jpg", "325living.jpg", "325livingWindow.jpg", "325Master.jpg", "325sitting.jpg", 
                         "3living.jpg", "441living.jpg", "441master.jpg", "441study.jpg")
  
  val otherImages = Array("IMG_0239.jpeg", "IMG_0429.jpeg", "IMG_0430.jpg", "IMG_0443.jpeg", "IMG_0651.jpeg", "IMG_0790.jpeg", "IMG_0792.jpeg", 
      "IMG_0793 2.jpeg", "IMG_0794 2.jpeg", "IMG_0807.jpeg", "IMG_0821.jpeg", "IMG_0830.jpeg", "IMG_0838.jpeg", "IMG_0893.jpeg", "IMG_0896.jpeg", 
      "IMG_1565.jpg", "IMG_1660.jpg", "IMG_1672.jpg", "IMG_1972.jpg", "IMG_2125.jpg", "IMG_2386.jpeg", "IMG_2779.jpg", "IMG_5074.jpg", "IMG_5744.jpg", 
      "IMG_5786.jpg", "IMG_5788.jpg", "IMG_5792.jpg", "IMG_5793.jpg", "IMG_5794.jpg", "IMG_5796.jpg", "IMG_5797.jpg", "IMG_5798.jpg", "IMG_5799.jpg", 
      "IMG_5800.jpg", "IMG_5809.jpg", "IMG_5810.jpg", "IMG_5817.jpg", "IMG_5824.jpg", "IMG_5825.jpg", "IMG_5827.jpg", "IMG_5839.jpg", "IMG_5840.jpg", 
      "IMG_5841.jpg", "IMG_9738.jpeg", "IMG_9744.jpeg", "IMG_9753.jpeg", "IMG_9762.jpeg")  
  
  val imageArr = otherImages.map(a=> addiFolder+a)++ addiImages
      
  var colNum = 0
  var rowNum = 0
  var idx = 0
  var numImages = imageArr.length
  
  val typeArr = Array.fill(14)("Before")++Array.fill(14)("After")++Array.fill(14)("Indoor")++Array.fill(14)("Outdoor")
  
  Await.result(db.run(Image.delete), Duration.Inf)
  Await.result(db.run(sqlu"ALTER TABLE image AUTO_INCREMENT = 1;"), Duration.Inf)
  Await.result(db.run(
    Image ++=Seq(
     ImageRow(0,absPath+imageArr(0), typeArr(0), 0, 0),
     ImageRow(0,absPath+imageArr(1), typeArr(1), 1, 0),
     ImageRow(0,absPath+imageArr(2), typeArr(2), 2, 0),
     ImageRow(0,absPath+imageArr(3), typeArr(3), 0, 1),
     ImageRow(0,absPath+imageArr(4), typeArr(4), 1, 1),
     ImageRow(0,absPath+imageArr(5), typeArr(5), 2, 1),
     ImageRow(0,absPath+imageArr(6), typeArr(6), 0, 2),
     ImageRow(0,absPath+imageArr(7), typeArr(7), 1, 2),
     ImageRow(0,absPath+imageArr(8), typeArr(8), 2, 2),
     ImageRow(0,absPath+imageArr(9), typeArr(9), 0, 3),
     ImageRow(0,absPath+imageArr(10), typeArr(10), 1, 3),
     ImageRow(0,absPath+imageArr(11), typeArr(11), 2, 3),
     ImageRow(0,absPath+imageArr(12), typeArr(12), 0, 4),
     ImageRow(0,absPath+imageArr(13), typeArr(13), 1, 4),
     ImageRow(0,absPath+imageArr(14), typeArr(14), 2, 4),
     ImageRow(0,absPath+imageArr(15), typeArr(15), 0, 5),
     ImageRow(0,absPath+imageArr(16), typeArr(16), 1, 5),
     ImageRow(0,absPath+imageArr(17), typeArr(17), 2, 5),
     ImageRow(0,absPath+imageArr(18), typeArr(18), 0, 6),
     ImageRow(0,absPath+imageArr(19), typeArr(19), 1, 6),
     ImageRow(0,absPath+imageArr(20), typeArr(20), 2, 6),
     ImageRow(0,absPath+imageArr(21), typeArr(21), 0, 7),
     ImageRow(0,absPath+imageArr(22), typeArr(22), 1, 7),
     ImageRow(0,absPath+imageArr(23), typeArr(23), 2, 7),
     ImageRow(0,absPath+imageArr(24), typeArr(24), 0, 8),
     ImageRow(0,absPath+imageArr(25), typeArr(25), 1, 8),
     ImageRow(0,absPath+imageArr(26), typeArr(26), 2, 8),
     ImageRow(0,absPath+imageArr(27), typeArr(27), 0, 9),
     ImageRow(0,absPath+imageArr(28), typeArr(28), 1, 9),
     ImageRow(0,absPath+imageArr(29), typeArr(29), 2, 9),
     ImageRow(0,absPath+imageArr(30), typeArr(30), 0, 10),
     ImageRow(0,absPath+imageArr(31), typeArr(31), 1, 10),
     ImageRow(0,absPath+imageArr(32), typeArr(32), 2, 10),
     ImageRow(0,absPath+imageArr(33), typeArr(33), 0, 11),
     ImageRow(0,absPath+imageArr(34), typeArr(34), 1, 11),
     ImageRow(0,absPath+imageArr(35), typeArr(35), 2, 11),
     ImageRow(0,absPath+imageArr(36), typeArr(36), 0, 12),
     ImageRow(0,absPath+imageArr(37), typeArr(37), 1, 12),
     ImageRow(0,absPath+imageArr(38), typeArr(38), 2, 12),
     ImageRow(0,absPath+imageArr(39), typeArr(39), 0, 13),
     ImageRow(0,absPath+imageArr(40), typeArr(40), 1, 13),
     ImageRow(0,absPath+imageArr(41), typeArr(41), 2, 13),
     ImageRow(0,absPath+imageArr(42), typeArr(42), 0, 14),
     ImageRow(0,absPath+imageArr(43), typeArr(43), 1, 14),
     ImageRow(0,absPath+imageArr(44), typeArr(44), 2, 14),
     ImageRow(0,absPath+imageArr(45), typeArr(45), 0, 15),
     ImageRow(0,absPath+imageArr(46), typeArr(46), 1, 15),
     ImageRow(0,absPath+imageArr(47), typeArr(47), 2, 15),
     ImageRow(0,absPath+imageArr(48), typeArr(48), 0, 16),
     ImageRow(0,absPath+imageArr(49), typeArr(49), 1, 16),
     ImageRow(0,absPath+imageArr(50), typeArr(50), 2, 16),
     ImageRow(0,absPath+imageArr(51), typeArr(51), 0, 17),
     ImageRow(0,absPath+imageArr(52), typeArr(52), 1, 17),
     ImageRow(0,absPath+imageArr(53), typeArr(53), 2, 17)
      
/*      ImageRow(0,"/versionedAssets/images/325Library.jpg", "Thing", 0, 0),
      ImageRow(0, "/versionedAssets/images/325living.jpg", "Before", 0, 1),
      ImageRow(0,"/versionedAssets/images/325livingWindow.jpg", "After", 0, 2),
      ImageRow(0, "/versionedAssets/images/325Master.jpg", "Indoor", 0,3),
      ImageRow(0, "/versionedAssets/images/325sitting.jpg", "Before", 1, 0),
      ImageRow(0, "/versionedAssets/images/3living.jpg", "After", 1, 1),
      ImageRow(0, "/versionedAssets/images/441living.jpg", "Outdoor", 1, 2),
      ImageRow(0, "/versionedAssets/images/441master.jpg", "After", 1, 3),
      ImageRow(0, "/versionedAssets/images/441study.jpg", "Before", 2, 0)*/
      
  )), Duration.Inf)
  db.close()
}