package models

import play.api.libs.json._

case class Place(name: String, location: Location)

object Place {

    implicit val format = Json.format[Place]    

    var list: List[Place] = {
        List(
          Place("Sandleford",     Location(51.377797, -1.318965)),
          Place("Watership Down", Location(51.235685, -1.309197))
        )
    }
      
    def save(place: Place) = {
        list = list ::: List(place)
    }
}