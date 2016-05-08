package data.entities

import com.novus.salat.annotations._
import org.bson.types.ObjectId
import org.joda.time.DateTime

case class PromotionEntity(
                            @Key("_id") id: ObjectId,
                            serviceId: ObjectId,
                            promoCode: Option[String] = None,
                            media: Option[String] = None,
                            title: Option[String] = None,
                            expirationDateTime: Option[DateTime] = None,
                            shortDescription: Option[String] = None,
                            fullDescription: Option[String] = None,
                            rule: Option[RuleEntity] = None
                          ) {

  override def hashCode(): Int = {
    val prime = 31
    var result = 1
    result = prime * result + (if (id == null) 0 else id.hashCode)
    return result
  }

  override def equals(that: Any): Boolean = {
    that match {
      case that: RegionEntity => that.canEqual(this) && this.hashCode == that.hashCode
      case _ => false
    }
  }
}