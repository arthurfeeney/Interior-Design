package models
// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends {
  val profile = slick.jdbc.MySQLProfile
} with Tables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables {
  val profile: slick.jdbc.JdbcProfile
  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = Image.schema ++ Receipt.schema ++ User.schema ++ UserTemporary.schema ++ Vendor.schema
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema

  /** Entity class storing rows of table Image
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param imglink Database column imglink SqlType(VARCHAR), Length(200,true)
   *  @param description Database column description SqlType(VARCHAR), Length(200,true), Default(None)
   *  @param colnum Database column colNum SqlType(INT)
   *  @param rownum Database column rowNum SqlType(INT) */
  case class ImageRow(id: Int, imglink: String, description: Option[String] = None, colnum: Int, rownum: Int)
  /** GetResult implicit for fetching ImageRow objects using plain SQL queries */
  implicit def GetResultImageRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]]): GR[ImageRow] = GR{
    prs => import prs._
    ImageRow.tupled((<<[Int], <<[String], <<?[String], <<[Int], <<[Int]))
  }
  /** Table description of table image. Objects of this class serve as prototypes for rows in queries. */
  class Image(_tableTag: Tag) extends profile.api.Table[ImageRow](_tableTag, Some("interior"), "image") {
    def * = (id, imglink, description, colnum, rownum) <> (ImageRow.tupled, ImageRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(imglink), description, Rep.Some(colnum), Rep.Some(rownum))).shaped.<>({r=>import r._; _1.map(_=> ImageRow.tupled((_1.get, _2.get, _3, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column imglink SqlType(VARCHAR), Length(200,true) */
    val imglink: Rep[String] = column[String]("imglink", O.Length(200,varying=true))
    /** Database column description SqlType(VARCHAR), Length(200,true), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(200,varying=true), O.Default(None))
    /** Database column colNum SqlType(INT) */
    val colnum: Rep[Int] = column[Int]("colNum")
    /** Database column rowNum SqlType(INT) */
    val rownum: Rep[Int] = column[Int]("rowNum")
  }
  /** Collection-like TableQuery object for table Image */
  lazy val Image = new TableQuery(tag => new Image(tag))

  /** Entity class storing rows of table Receipt
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param userid Database column userID SqlType(INT)
   *  @param vendorid Database column vendorID SqlType(INT)
   *  @param price Database column price SqlType(FLOAT), Default(None)
   *  @param description Database column description SqlType(VARCHAR), Length(200,true), Default(None)
   *  @param item Database column item SqlType(VARCHAR), Length(200,true), Default(None) */
  case class ReceiptRow(id: Int, userid: Int, vendorid: Int, price: Option[Float] = None, description: Option[String] = None, item: Option[String] = None)
  /** GetResult implicit for fetching ReceiptRow objects using plain SQL queries */
  implicit def GetResultReceiptRow(implicit e0: GR[Int], e1: GR[Option[Float]], e2: GR[Option[String]]): GR[ReceiptRow] = GR{
    prs => import prs._
    ReceiptRow.tupled((<<[Int], <<[Int], <<[Int], <<?[Float], <<?[String], <<?[String]))
  }
  /** Table description of table receipt. Objects of this class serve as prototypes for rows in queries. */
  class Receipt(_tableTag: Tag) extends profile.api.Table[ReceiptRow](_tableTag, Some("interior"), "receipt") {
    def * = (id, userid, vendorid, price, description, item) <> (ReceiptRow.tupled, ReceiptRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), Rep.Some(userid), Rep.Some(vendorid), price, description, item)).shaped.<>({r=>import r._; _1.map(_=> ReceiptRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column userID SqlType(INT) */
    val userid: Rep[Int] = column[Int]("userID")
    /** Database column vendorID SqlType(INT) */
    val vendorid: Rep[Int] = column[Int]("vendorID")
    /** Database column price SqlType(FLOAT), Default(None) */
    val price: Rep[Option[Float]] = column[Option[Float]]("price", O.Default(None))
    /** Database column description SqlType(VARCHAR), Length(200,true), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(200,varying=true), O.Default(None))
    /** Database column item SqlType(VARCHAR), Length(200,true), Default(None) */
    val item: Rep[Option[String]] = column[Option[String]]("item", O.Length(200,varying=true), O.Default(None))

    /** Foreign key referencing User (database name receipt_ibfk_1) */
    lazy val userFk = foreignKey("receipt_ibfk_1", userid, User)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.Cascade)
    /** Foreign key referencing Vendor (database name receipt_ibfk_2) */
    lazy val vendorFk = foreignKey("receipt_ibfk_2", vendorid, Vendor)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.Cascade)
  }
  /** Collection-like TableQuery object for table Receipt */
  lazy val Receipt = new TableQuery(tag => new Receipt(tag))

  /** Entity class storing rows of table User
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param username Database column username SqlType(VARCHAR), Length(200,true), Default(None)
   *  @param password Database column password SqlType(VARCHAR), Length(200,true), Default(None)
   *  @param name Database column name SqlType(VARCHAR), Length(200,true), Default(None)
   *  @param email Database column email SqlType(VARCHAR), Length(200,true), Default(None)
   *  @param phoneno Database column phoneNo SqlType(INT), Default(None) */
  case class UserRow(id: Int, username: Option[String] = None, password: Option[String] = None, name: Option[String] = None, email: Option[String] = None, phoneno: Option[Int] = None)
  /** GetResult implicit for fetching UserRow objects using plain SQL queries */
  implicit def GetResultUserRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[Option[Int]]): GR[UserRow] = GR{
    prs => import prs._
    UserRow.tupled((<<[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Int]))
  }
  /** Table description of table user. Objects of this class serve as prototypes for rows in queries. */
  class User(_tableTag: Tag) extends profile.api.Table[UserRow](_tableTag, Some("interior"), "user") {
    def * = (id, username, password, name, email, phoneno) <> (UserRow.tupled, UserRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), username, password, name, email, phoneno)).shaped.<>({r=>import r._; _1.map(_=> UserRow.tupled((_1.get, _2, _3, _4, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column username SqlType(VARCHAR), Length(200,true), Default(None) */
    val username: Rep[Option[String]] = column[Option[String]]("username", O.Length(200,varying=true), O.Default(None))
    /** Database column password SqlType(VARCHAR), Length(200,true), Default(None) */
    val password: Rep[Option[String]] = column[Option[String]]("password", O.Length(200,varying=true), O.Default(None))
    /** Database column name SqlType(VARCHAR), Length(200,true), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Length(200,varying=true), O.Default(None))
    /** Database column email SqlType(VARCHAR), Length(200,true), Default(None) */
    val email: Rep[Option[String]] = column[Option[String]]("email", O.Length(200,varying=true), O.Default(None))
    /** Database column phoneNo SqlType(INT), Default(None) */
    val phoneno: Rep[Option[Int]] = column[Option[Int]]("phoneNo", O.Default(None))
  }
  /** Collection-like TableQuery object for table User */
  lazy val User = new TableQuery(tag => new User(tag))

  /** Entity class storing rows of table UserTemporary
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param username Database column username SqlType(VARCHAR), Length(200,true), Default(None)
   *  @param password Database column password SqlType(VARCHAR), Length(200,true), Default(None) */
  case class UserTemporaryRow(id: Int, username: Option[String] = None, password: Option[String] = None)
  /** GetResult implicit for fetching UserTemporaryRow objects using plain SQL queries */
  implicit def GetResultUserTemporaryRow(implicit e0: GR[Int], e1: GR[Option[String]]): GR[UserTemporaryRow] = GR{
    prs => import prs._
    UserTemporaryRow.tupled((<<[Int], <<?[String], <<?[String]))
  }
  /** Table description of table user_temporary. Objects of this class serve as prototypes for rows in queries. */
  class UserTemporary(_tableTag: Tag) extends profile.api.Table[UserTemporaryRow](_tableTag, Some("interior"), "user_temporary") {
    def * = (id, username, password) <> (UserTemporaryRow.tupled, UserTemporaryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), username, password)).shaped.<>({r=>import r._; _1.map(_=> UserTemporaryRow.tupled((_1.get, _2, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column username SqlType(VARCHAR), Length(200,true), Default(None) */
    val username: Rep[Option[String]] = column[Option[String]]("username", O.Length(200,varying=true), O.Default(None))
    /** Database column password SqlType(VARCHAR), Length(200,true), Default(None) */
    val password: Rep[Option[String]] = column[Option[String]]("password", O.Length(200,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table UserTemporary */
  lazy val UserTemporary = new TableQuery(tag => new UserTemporary(tag))

  /** Entity class storing rows of table Vendor
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(VARCHAR), Length(200,true), Default(None)
   *  @param phone Database column phone SqlType(INT), Default(None)
   *  @param email Database column email SqlType(VARCHAR), Length(200,true), Default(None)
   *  @param street Database column street SqlType(VARCHAR), Length(200,true), Default(None)
   *  @param city Database column city SqlType(VARCHAR), Length(200,true), Default(None)
   *  @param state Database column state SqlType(VARCHAR), Length(2,true), Default(None)
   *  @param zip Database column zip SqlType(VARCHAR), Length(7,true), Default(None) */
  case class VendorRow(id: Int, name: Option[String] = None, phone: Option[Int] = None, email: Option[String] = None, street: Option[String] = None, city: Option[String] = None, state: Option[String] = None, zip: Option[String] = None)
  /** GetResult implicit for fetching VendorRow objects using plain SQL queries */
  implicit def GetResultVendorRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[Option[Int]]): GR[VendorRow] = GR{
    prs => import prs._
    VendorRow.tupled((<<[Int], <<?[String], <<?[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table vendor. Objects of this class serve as prototypes for rows in queries. */
  class Vendor(_tableTag: Tag) extends profile.api.Table[VendorRow](_tableTag, Some("interior"), "vendor") {
    def * = (id, name, phone, email, street, city, state, zip) <> (VendorRow.tupled, VendorRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(id), name, phone, email, street, city, state, zip)).shaped.<>({r=>import r._; _1.map(_=> VendorRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(200,true), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Length(200,varying=true), O.Default(None))
    /** Database column phone SqlType(INT), Default(None) */
    val phone: Rep[Option[Int]] = column[Option[Int]]("phone", O.Default(None))
    /** Database column email SqlType(VARCHAR), Length(200,true), Default(None) */
    val email: Rep[Option[String]] = column[Option[String]]("email", O.Length(200,varying=true), O.Default(None))
    /** Database column street SqlType(VARCHAR), Length(200,true), Default(None) */
    val street: Rep[Option[String]] = column[Option[String]]("street", O.Length(200,varying=true), O.Default(None))
    /** Database column city SqlType(VARCHAR), Length(200,true), Default(None) */
    val city: Rep[Option[String]] = column[Option[String]]("city", O.Length(200,varying=true), O.Default(None))
    /** Database column state SqlType(VARCHAR), Length(2,true), Default(None) */
    val state: Rep[Option[String]] = column[Option[String]]("state", O.Length(2,varying=true), O.Default(None))
    /** Database column zip SqlType(VARCHAR), Length(7,true), Default(None) */
    val zip: Rep[Option[String]] = column[Option[String]]("zip", O.Length(7,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table Vendor */
  lazy val Vendor = new TableQuery(tag => new Vendor(tag))
}
