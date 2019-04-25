// @GENERATOR:play-routes-compiler
// @SOURCE:/users/cluikart/InteriorDesign-WebApps-S19/server/conf/routes
// @DATE:Thu Apr 25 16:01:41 CDT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:10
package edu.trinity.webapps.controllers {

  // @LINE:15
  class ReverseSiteController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def postQuery(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "query")
    }
  
    // @LINE:22
    def news(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "news")
    }
  
    // @LINE:23
    def about(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "about")
    }
  
    // @LINE:16
    def addUser(name:String, pw:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addUser" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("pw", pw)))))
    }
  
    // @LINE:15
    def loginUser(name:String, pw:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "loginUser" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("pw", pw)))))
    }
  
    // @LINE:20
    def gallery(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "gallery")
    }
  
  }

  // @LINE:10
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def index(): Call = {
    
      () match {
      
        // @LINE:10
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
  }


}
