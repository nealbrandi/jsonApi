// @SOURCE:/Users/nealbrandi/code/jsonApi/conf/routes
// @HASH:6cdda61cf4f9ebf99d2c1a11790563ac365a8696
// @DATE:Sun May 31 18:51:05 EDT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:7
// @LINE:5
// @LINE:3
// @LINE:2
package controllers {

// @LINE:7
class ReverseAssets {


// @LINE:7
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:5
// @LINE:3
// @LINE:2
class ReverseApi {


// @LINE:5
def listEvents(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "event/list")
}
                        

// @LINE:2
def listPlaces(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "place/list")
}
                        

// @LINE:3
def savePlace(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "place")
}
                        

}
                          
}
                  


// @LINE:7
// @LINE:5
// @LINE:3
// @LINE:2
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:7
class ReverseAssets {


// @LINE:7
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:5
// @LINE:3
// @LINE:2
class ReverseApi {


// @LINE:5
def listEvents : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Api.listEvents",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "event/list"})
      }
   """
)
                        

// @LINE:2
def listPlaces : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Api.listPlaces",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "place/list"})
      }
   """
)
                        

// @LINE:3
def savePlace : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Api.savePlace",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "place"})
      }
   """
)
                        

}
              
}
        


// @LINE:7
// @LINE:5
// @LINE:3
// @LINE:2
package controllers.ref {


// @LINE:7
class ReverseAssets {


// @LINE:7
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:5
// @LINE:3
// @LINE:2
class ReverseApi {


// @LINE:5
def listEvents(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Api.listEvents(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Api", "listEvents", Seq(), "GET", """""", _prefix + """event/list""")
)
                      

// @LINE:2
def listPlaces(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Api.listPlaces(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Api", "listPlaces", Seq(), "GET", """""", _prefix + """place/list""")
)
                      

// @LINE:3
def savePlace(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Api.savePlace(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Api", "savePlace", Seq(), "POST", """""", _prefix + """place""")
)
                      

}
                          
}
        
    