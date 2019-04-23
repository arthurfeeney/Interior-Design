// @GENERATOR:play-routes-compiler
// @SOURCE:/users/afeeney/WebApp/InteriorDesign-WebApps-S19/server/conf/routes
// @DATE:Sun Apr 14 13:44:48 CDT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_2: edu.trinity.webapps.controllers.Application,
  // @LINE:9
  SiteController_0: edu.trinity.webapps.controllers.SiteController,
  // @LINE:25
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_2: edu.trinity.webapps.controllers.Application,
    // @LINE:9
    SiteController_0: edu.trinity.webapps.controllers.SiteController,
    // @LINE:25
    Assets_1: controllers.Assets
  ) = this(errorHandler, Application_2, SiteController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_2, SiteController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """edu.trinity.webapps.controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """edu.trinity.webapps.controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginUser""", """edu.trinity.webapps.controllers.SiteController.loginUser(name:String, pw:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUser""", """edu.trinity.webapps.controllers.SiteController.addUser(name:String, pw:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """edu.trinity.webapps.controllers.SiteController.contact"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gallery""", """edu.trinity.webapps.controllers.SiteController.gallery"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """news""", """edu.trinity.webapps.controllers.SiteController.news"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """edu.trinity.webapps.controllers.SiteController.about"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query""", """edu.trinity.webapps.controllers.SiteController.postQuery"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """versionedAssets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val edu_trinity_webapps_controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val edu_trinity_webapps_controllers_Application_index0_invoker = createInvoker(
    Application_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "edu.trinity.webapps.controllers.Application",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val edu_trinity_webapps_controllers_Application_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val edu_trinity_webapps_controllers_Application_index1_invoker = createInvoker(
    Application_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "edu.trinity.webapps.controllers.Application",
      "index",
      Nil,
      "GET",
      this.prefix + """home""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val edu_trinity_webapps_controllers_SiteController_loginUser2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginUser")))
  )
  private[this] lazy val edu_trinity_webapps_controllers_SiteController_loginUser2_invoker = createInvoker(
    SiteController_0.loginUser(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "edu.trinity.webapps.controllers.SiteController",
      "loginUser",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """loginUser""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val edu_trinity_webapps_controllers_SiteController_addUser3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUser")))
  )
  private[this] lazy val edu_trinity_webapps_controllers_SiteController_addUser3_invoker = createInvoker(
    SiteController_0.addUser(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "edu.trinity.webapps.controllers.SiteController",
      "addUser",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """addUser""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val edu_trinity_webapps_controllers_SiteController_contact4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val edu_trinity_webapps_controllers_SiteController_contact4_invoker = createInvoker(
    SiteController_0.contact,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "edu.trinity.webapps.controllers.SiteController",
      "contact",
      Nil,
      "GET",
      this.prefix + """contact""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val edu_trinity_webapps_controllers_SiteController_gallery5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gallery")))
  )
  private[this] lazy val edu_trinity_webapps_controllers_SiteController_gallery5_invoker = createInvoker(
    SiteController_0.gallery,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "edu.trinity.webapps.controllers.SiteController",
      "gallery",
      Nil,
      "GET",
      this.prefix + """gallery""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val edu_trinity_webapps_controllers_SiteController_news6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("news")))
  )
  private[this] lazy val edu_trinity_webapps_controllers_SiteController_news6_invoker = createInvoker(
    SiteController_0.news,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "edu.trinity.webapps.controllers.SiteController",
      "news",
      Nil,
      "GET",
      this.prefix + """news""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val edu_trinity_webapps_controllers_SiteController_about7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val edu_trinity_webapps_controllers_SiteController_about7_invoker = createInvoker(
    SiteController_0.about,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "edu.trinity.webapps.controllers.SiteController",
      "about",
      Nil,
      "GET",
      this.prefix + """about""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val edu_trinity_webapps_controllers_SiteController_postQuery8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query")))
  )
  private[this] lazy val edu_trinity_webapps_controllers_SiteController_postQuery8_invoker = createInvoker(
    SiteController_0.postQuery,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "edu.trinity.webapps.controllers.SiteController",
      "postQuery",
      Nil,
      "POST",
      this.prefix + """query""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Assets_at9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at9_invoker = createInvoker(
    Assets_1.at(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Prefix must match `play.assets.urlPrefix`""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("versionedAssets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """versionedAssets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case edu_trinity_webapps_controllers_Application_index0_route(params@_) =>
      call { 
        edu_trinity_webapps_controllers_Application_index0_invoker.call(Application_2.index)
      }
  
    // @LINE:7
    case edu_trinity_webapps_controllers_Application_index1_route(params@_) =>
      call { 
        edu_trinity_webapps_controllers_Application_index1_invoker.call(Application_2.index)
      }
  
    // @LINE:9
    case edu_trinity_webapps_controllers_SiteController_loginUser2_route(params@_) =>
      call(params.fromQuery[String]("name", None), params.fromQuery[String]("pw", None)) { (name, pw) =>
        edu_trinity_webapps_controllers_SiteController_loginUser2_invoker.call(SiteController_0.loginUser(name, pw))
      }
  
    // @LINE:10
    case edu_trinity_webapps_controllers_SiteController_addUser3_route(params@_) =>
      call(params.fromQuery[String]("name", None), params.fromQuery[String]("pw", None)) { (name, pw) =>
        edu_trinity_webapps_controllers_SiteController_addUser3_invoker.call(SiteController_0.addUser(name, pw))
      }
  
    // @LINE:12
    case edu_trinity_webapps_controllers_SiteController_contact4_route(params@_) =>
      call { 
        edu_trinity_webapps_controllers_SiteController_contact4_invoker.call(SiteController_0.contact)
      }
  
    // @LINE:14
    case edu_trinity_webapps_controllers_SiteController_gallery5_route(params@_) =>
      call { 
        edu_trinity_webapps_controllers_SiteController_gallery5_invoker.call(SiteController_0.gallery)
      }
  
    // @LINE:16
    case edu_trinity_webapps_controllers_SiteController_news6_route(params@_) =>
      call { 
        edu_trinity_webapps_controllers_SiteController_news6_invoker.call(SiteController_0.news)
      }
  
    // @LINE:17
    case edu_trinity_webapps_controllers_SiteController_about7_route(params@_) =>
      call { 
        edu_trinity_webapps_controllers_SiteController_about7_invoker.call(SiteController_0.about)
      }
  
    // @LINE:23
    case edu_trinity_webapps_controllers_SiteController_postQuery8_route(params@_) =>
      call { 
        edu_trinity_webapps_controllers_SiteController_postQuery8_invoker.call(SiteController_0.postQuery)
      }
  
    // @LINE:25
    case controllers_Assets_at9_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_at9_invoker.call(Assets_1.at(file))
      }
  
    // @LINE:26
    case controllers_Assets_versioned10_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
