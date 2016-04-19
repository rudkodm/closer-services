package config

import data.storages.{PromotionStorage, RegionStorage}
import com.google.inject.AbstractModule
import data.storages.impl.{PromotionMongoStorage, RegionMongoStorage}

class DefaultModule extends AbstractModule {
  def configure() = {
    bind(classOf[RegionStorage]).to(classOf[RegionMongoStorage])
    bind(classOf[PromotionStorage]).to(classOf[PromotionMongoStorage])
  }
}