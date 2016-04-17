package com.closer.regions.model

import play.api.libs.json.Json

/**
  * Created by rudkodm on 4/17/16.
  */
case class Zone(
                 center: Location,
                 radius: Double
               )

object Zone {
  implicit val object2Json = Json.writes[Zone]
  implicit val json2object = Json.reads[Zone]
}