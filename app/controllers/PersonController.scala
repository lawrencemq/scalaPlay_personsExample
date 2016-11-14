package controllers

import models.{DB, Person}
import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.json.Json
import play.api.mvc.{Action, Controller}

class PersonController extends Controller {

  val personForm: Form[Person] = Form {
    mapping(
      "name" -> text
    )(Person.apply)(Person.unapply)
  }

  def addPerson = Action {
    implicit request =>
      val person: Person = personForm.bindFromRequest.get
      DB.save(person)
      Redirect(routes.HomeController.index())
  }

  def getPersons = Action {
    val persons = DB.query[Person].fetch()
    Ok(Json.toJson(persons))
  }

}
