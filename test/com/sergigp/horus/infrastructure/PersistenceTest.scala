package com.sergigp.horus.infrastructure

import com.sergigp.horus.domain.user.UserRepository
import play.api.inject.Injector
import play.api.inject.guice.GuiceApplicationBuilder
import org.scalatest._
import org.scalatest.concurrent.ScalaFutures

class PersistenceTest extends WordSpec
  with Matchers
  with OptionValues
  with ScalaFutures
  with BeforeAndAfterEach {

  var injector: Injector = _

  override def beforeEach() {
    injector = new GuiceApplicationBuilder().injector
    EnvironmentArranger.cleanDatabase(injector)
  }

  // @TODO maybe instantiate repo instead delegate to injector?
  def userRepository = injector.instanceOf[UserRepository]
}
