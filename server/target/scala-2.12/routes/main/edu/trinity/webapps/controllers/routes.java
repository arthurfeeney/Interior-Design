// @GENERATOR:play-routes-compiler
// @SOURCE:/users/cluikart/InteriorDesign-WebApps-S19/server/conf/routes
// @DATE:Wed May 08 13:32:59 CDT 2019

package edu.trinity.webapps.controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final edu.trinity.webapps.controllers.ReverseSiteController SiteController = new edu.trinity.webapps.controllers.ReverseSiteController(RoutesPrefix.byNamePrefix());
  public static final edu.trinity.webapps.controllers.ReverseApplication Application = new edu.trinity.webapps.controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final edu.trinity.webapps.controllers.javascript.ReverseSiteController SiteController = new edu.trinity.webapps.controllers.javascript.ReverseSiteController(RoutesPrefix.byNamePrefix());
    public static final edu.trinity.webapps.controllers.javascript.ReverseApplication Application = new edu.trinity.webapps.controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
