package services

import model.Promotion

trait PromotionService {

  def all(regionId: String): Seq[Promotion]

  def save(regionId: String, promo: Promotion): Promotion

  def getById(regionId: String, id: String): Option[Promotion]

  def removeById(regionId: String, id: String): Unit
  
}
