// @GENERATOR:play-routes-compiler
// @SOURCE:/users/cluikart/InteriorDesign-WebApps-S19/server/conf/routes
// @DATE:Sun Mar 31 15:18:54 CDT 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}