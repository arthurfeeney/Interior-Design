// @GENERATOR:play-routes-compiler
// @SOURCE:/users/cluikart/InteriorDesign-WebApps-S19/server/conf/routes
// @DATE:Sun Mar 31 15:18:54 CDT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package edu.trinity.webapps.controllers.javascript {

  // @LINE:7
  class ReverseSiteController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
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