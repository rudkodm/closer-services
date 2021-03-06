package data.entities

import com.novus.salat.annotations._
import org.bson.types.ObjectId


case class RegionEntity (
                         @Key("_id") id: ObjectId,
                         name: String,
                         description: Option[String] = None,
                         zone: Option[ZoneEntity] = None
                       ) extends BaseEntity

