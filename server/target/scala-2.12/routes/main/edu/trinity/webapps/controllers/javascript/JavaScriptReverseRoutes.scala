// @GENERATOR:play-routes-compiler
// @SOURCE:/users/afeeney/WebApp/InteriorDesign-WebApps-S19/server/conf/routes
// @DATE:Sun Apr 14 13:44:48 CDT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package edu.trinity.webapps.controllers.javascript {

  // @LINE:9
  class ReverseSiteController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def postQuery: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "edu.trinity.webapps.controllers.SiteController.postQuery",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "query"})
        }
      """
    )
  
    // @LINE:16
    def news: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "edu.trinity.webapps.controllers.SiteController.news",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "news"})
        }
      """
    )
  
    // @LINE:17
    def about: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "edu.trinity.webapps.controllers.SiteController.about",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
        }
      """
    )
  
    // @LINE:10
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "edu.trinity.webapps.controllers.SiteController.addUser",
      """
        function(name0,pw1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addUser" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("pw", pw1)])})
        }
      """
    )
  
    // @LINE:9
    def loginUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "edu.trinity.webapps.controllers.SiteController.loginUser",
      """
        function(name0,pw1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loginUser" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("pw", pw1)])})
        }
      """
    )
  
    // @LINE:12
    def contact: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "edu.trinity.webapps.controllers.SiteController.contact",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
        }
      """
    )
  
    // @LINE:14
    def gallery: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "edu.trinity.webapps.controllers.SiteController.gallery",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gallery"})
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
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
  }


}
