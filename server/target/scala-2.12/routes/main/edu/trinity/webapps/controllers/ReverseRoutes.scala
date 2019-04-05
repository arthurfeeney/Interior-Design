// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:/users/alillbac/csci3345/InteriorDesign-WebApps-S19/server/conf/routes
// @DATE:Fri Apr 05 15:05:46 CDT 2019
=======
// @SOURCE:/Users/Nihil/workspace/InteriorDesign-WebApps-S19/server/conf/routes
// @DATE:Fri Apr 05 15:12:20 CDT 2019
>>>>>>> 3bc42ee90cb7e43490fad41ef175919f2492d7ac

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package edu.trinity.webapps.controllers {

  // @LINE:7
  class ReverseSiteController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def postQuery(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "query")
    }
  
    // @LINE:7
    def contact(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contact")
    }
  
    // @LINE:8
    def gallery(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "gallery")
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
