package web

import model.Location
import play.api.libs.json.Json

case class SearchRQ(
                                center: Location,
                                radius: Double = 500,
                                num: Int = 10
                              )

object SearchRQ {
  implicit val zoneJsonFormat = Json.format[SearchRQ]
}