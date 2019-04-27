// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Nihil/workspace/InteriorDesign-WebApps-S19/server/conf/routes
// @DATE:Sat Apr 27 12:03:23 CDT 2019

package edu.trinity.webapps.controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final edu.trinity.webapps.controllers.ReverseSiteController SiteController = new edu.trinity.webapps.controllers.ReverseSiteController(RoutesPrefix.byNamePrefix());
  public static final edu.trinity.webapps.controllers.ReverseContactController ContactController = new edu.trinity.webapps.controllers.ReverseContactController(RoutesPrefix.byNamePrefix());
  public static final edu.trinity.webapps.controllers.ReverseApplication Application = new edu.trinity.webapps.controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final edu.trinity.webapps.controllers.javascript.ReverseSiteController SiteController = new edu.trinity.webapps.controllers.javascript.ReverseSiteController(RoutesPrefix.byNamePrefix());
    public static final edu.trinity.webapps.controllers.javascript.ReverseContactController ContactController = new edu.trinity.webapps.controllers.javascript.ReverseContactController(RoutesPrefix.byNamePrefix());
    public static final edu.trinity.webapps.controllers.javascript.ReverseApplication Application = new edu.trinity.webapps.controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
