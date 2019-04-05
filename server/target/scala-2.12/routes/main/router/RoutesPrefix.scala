// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:/users/alillbac/csci3345/InteriorDesign-WebApps-S19/server/conf/routes
// @DATE:Fri Apr 05 15:05:46 CDT 2019
=======
// @SOURCE:/Users/Nihil/workspace/InteriorDesign-WebApps-S19/server/conf/routes
// @DATE:Fri Apr 05 15:12:20 CDT 2019
>>>>>>> 3bc42ee90cb7e43490fad41ef175919f2492d7ac


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
