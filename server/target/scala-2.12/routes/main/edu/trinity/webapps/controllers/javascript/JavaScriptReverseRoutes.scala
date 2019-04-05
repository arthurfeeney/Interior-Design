// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Nihil/workspace/InteriorDesign-WebApps-S19/server/conf/routes
// @DATE:Fri Apr 05 15:12:20 CDT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package edu.trinity.webapps.controllers.javascript {

  // @LINE:7
  class ReverseSiteController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def postQuery: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "edu.trinity.webapps.controllers.SiteController.postQuery",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "query"})
        }
      """
    )
  
    // @LINE:7
    def contact: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "edu.trinity.webapps.controllers.SiteController.contact",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "edu.trinity.webapps.controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}
