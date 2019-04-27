// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Nihil/workspace/InteriorDesign-WebApps-S19/server/conf/routes
// @DATE:Sat Apr 27 12:03:23 CDT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:10
package edu.trinity.webapps.controllers.javascript {

  // @LINE:15
  class ReverseSiteController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def postQuery: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "edu.trinity.webapps.controllers.SiteController.postQuery",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "query"})
        }
      """
    )
  
    // @LINE:22
    def news: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "edu.trinity.webapps.controllers.SiteController.news",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "news"})
        }
      """
    )
  
    // @LINE:23
    def about: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "edu.trinity.webapps.controllers.SiteController.about",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
        }
      """
    )
  
    // @LINE:16
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "edu.trinity.webapps.controllers.SiteController.addUser",
      """
        function(name0,pw1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addUser" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("pw", pw1)])})
        }
      """
    )
  
    // @LINE:15
    def loginUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "edu.trinity.webapps.controllers.SiteController.loginUser",
      """
        function(name0,pw1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loginUser" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("pw", pw1)])})
        }
      """
    )
  
    // @LINE:20
    def gallery: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "edu.trinity.webapps.controllers.SiteController.gallery",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gallery"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseContactController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def contact: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "edu.trinity.webapps.controllers.ContactController.contact",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "edu.trinity.webapps.controllers.Application.index",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
  }


}
