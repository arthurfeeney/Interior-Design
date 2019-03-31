// @GENERATOR:play-routes-compiler
// @SOURCE:/users/afeeney/WebApp/InteriorDesign-WebApps-S19/server/conf/routes
// @DATE:Sun Mar 31 14:57:31 CDT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package edu.trinity.webapps.controllers {

  // @LINE:7
  class ReverseSiteController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def contact(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contact")
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
