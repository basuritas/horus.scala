package com.sergigp.playms.tests.infrastructure.persistence

import com.sergigp.playms.infrastructure.PersistenceTest
import com.sergigp.playms.stub.{UserIdStub, UserStub}

class UserRepositoryTest extends PersistenceTest {

  "users repository" should {
    "find an existing user" in {
      val user = UserStub.random

      userRepository.create(user)

      userRepository.find(user.id).futureValue.value shouldBe user
    }

    "return None when finding a non existing user" in {
      userRepository.find(UserIdStub.random).futureValue shouldBe None
    }

    "find an existing user by name" in {
      val user = UserStub.random

      userRepository.create(user)

      userRepository.findByName(user.name).futureValue.value shouldBe user
    }
  }
}
