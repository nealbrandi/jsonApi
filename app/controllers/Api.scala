package controllers

import play.api.mvc._
import play.api.libs.json._

import models.{Location, Place, Event}

object Api extends Controller {

    def listPlaces = Action {
        val json = Json.toJson(Place.list)
        Ok(json)
    }

    def listEvents = Action {
        Ok(Json.toJson(Event.list))
    }

    def savePlace = Action(BodyParsers.parse.json) { request =>
        val result = request.body.validate[Place]
        result.fold(
            errors => {
                BadRequest(Json.obj("status" ->"KO", "message" -> JsError.toFlatJson(errors)))
            },
            place => { 
                Place.save(place)
                Ok(Json.obj("status" ->"OK", "message" -> ("Place '" + place.name + "' saved.") ))  
            }
        )
    }      

    def saveEvent = Action(parse.json) { request =>
        val result = request.body.validate[Event]
        result.fold(
            errors => {
                BadRequest(Json.obj("status" ->"KO", "message" -> JsError.toFlatJson(errors)))
            },
            event => { 
                Event.save(event)
                Ok(Json.obj("status" ->"OK", "message" -> ("Place '" + event.name + "' saved.") ))  
            }
        )
    }
}