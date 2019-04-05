// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:/users/alillbac/csci3345/InteriorDesign-WebApps-S19/server/conf/routes
// @DATE:Fri Apr 05 15:05:46 CDT 2019
=======
// @SOURCE:/Users/Nihil/workspace/InteriorDesign-WebApps-S19/server/conf/routes
// @DATE:Fri Apr 05 15:12:20 CDT 2019
>>>>>>> 3bc42ee90cb7e43490fad41ef175919f2492d7ac

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

<<<<<<< HEAD
// @LINE:10
package controllers.javascript {

  // @LINE:10
=======
// @LINE:11
package controllers.javascript {

  // @LINE:11
>>>>>>> 3bc42ee90cb7e43490fad41ef175919f2492d7ac
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
<<<<<<< HEAD
    // @LINE:10
=======
    // @LINE:11
>>>>>>> 3bc42ee90cb7e43490fad41ef175919f2492d7ac
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file0)})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:11
=======
    // @LINE:12
>>>>>>> 3bc42ee90cb7e43490fad41ef175919f2492d7ac
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "versionedAssets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
