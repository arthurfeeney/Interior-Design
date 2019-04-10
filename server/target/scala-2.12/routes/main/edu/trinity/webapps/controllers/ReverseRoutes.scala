// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Nihil/workspace/InteriorDesign-WebApps-S19/server/conf/routes
// @DATE:Wed Apr 10 15:54:09 CDT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package edu.trinity.webapps.controllers {

  // @LINE:8
  class ReverseSiteController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def postQuery(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "query")
    }
  
    // @LINE:12
    def news(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "news")
    }
  
    // @LINE:13
    def about(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "about")
    }
  
    // @LINE:8
    def contact(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contact")
    }
  
    // @LINE:10
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
    
      () match {
      
        // @LINE:6
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
  }


}
