// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Nihil/workspace/InteriorDesign-WebApps-S19/server/conf/routes
// @DATE:Sat Apr 27 12:03:23 CDT 2019


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
