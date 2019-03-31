// @GENERATOR:play-routes-compiler
// @SOURCE:/users/npatel5/workspace/InteriorDesign-WebApps-S19/server/conf/routes
// @DATE:Sun Mar 31 13:48:50 CDT 2019


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
