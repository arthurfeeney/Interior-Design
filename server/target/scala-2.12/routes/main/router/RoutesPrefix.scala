// @GENERATOR:play-routes-compiler
// @SOURCE:/users/cluikart/InteriorDesign-WebApps-S19/server/conf/routes
// @DATE:Thu Apr 25 16:16:47 CDT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
