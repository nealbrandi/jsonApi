package models

import play.api.libs.json._

case class Event(name:        String, 
                 description: String, 
                 place:       Option[Place])

object Event {

    implicit val format = Json.format[Event]    

    var list: List[Event] = {
        List(
          Event("Coffee Break!", 
                "Quick break from the grind.", 
                Some(Place("Little Collins", Location(40.760145, -73.969642)))),
          Event("Stand Up All Stars", 
                "Top talent from local open mikes", 
                Some(Place("Caroline's", Location(40.761947, -73.983811))))
        )
    }
      
    def save(event: Event) = {
        list = list ::: List(event)
    }  
}