// @GENERATOR:play-routes-compiler
// @SOURCE:/users/cluikart/InteriorDesign-WebApps-S19/server/conf/routes
// @DATE:Sun Mar 31 15:18:54 CDT 2019


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