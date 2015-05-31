// @SOURCE:/Users/nealbrandi/code/jsonApi/conf/routes
// @HASH:6cdda61cf4f9ebf99d2c1a11790563ac365a8696
// @DATE:Sun May 31 18:51:05 EDT 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:2
private[this] lazy val controllers_Api_listPlaces0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("place/list"))))
private[this] lazy val controllers_Api_listPlaces0_invoker = createInvoker(
controllers.Api.listPlaces,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Api", "listPlaces", Nil,"GET", """""", Routes.prefix + """place/list"""))
        

// @LINE:3
private[this] lazy val controllers_Api_savePlace1_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("place"))))
private[this] lazy val controllers_Api_savePlace1_invoker = createInvoker(
controllers.Api.savePlace,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Api", "savePlace", Nil,"POST", """""", Routes.prefix + """place"""))
        

// @LINE:5
private[this] lazy val controllers_Api_listEvents2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("event/list"))))
private[this] lazy val controllers_Api_listEvents2_invoker = createInvoker(
controllers.Api.listEvents,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Api", "listEvents", Nil,"GET", """""", Routes.prefix + """event/list"""))
        

// @LINE:7
private[this] lazy val controllers_Assets_at3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at3_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """place/list""","""controllers.Api.listPlaces"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """place""","""controllers.Api.savePlace"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """event/list""","""controllers.Api.listEvents"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:2
case controllers_Api_listPlaces0_route(params) => {
   call { 
        controllers_Api_listPlaces0_invoker.call(controllers.Api.listPlaces)
   }
}
        

// @LINE:3
case controllers_Api_savePlace1_route(params) => {
   call { 
        controllers_Api_savePlace1_invoker.call(controllers.Api.savePlace)
   }
}
        

// @LINE:5
case controllers_Api_listEvents2_route(params) => {
   call { 
        controllers_Api_listEvents2_invoker.call(controllers.Api.listEvents)
   }
}
        

// @LINE:7
case controllers_Assets_at3_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at3_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     