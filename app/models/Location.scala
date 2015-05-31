package models

import play.api.libs.json._

case class Location(lat: Double, long: Double)

object Location {

    implicit val format = Json.format[Location]    
}