package com.sergigp.horus.tests.acceptance

import com.sergigp.horus.infrastructure.AcceptanceSpec
import com.sergigp.horus.stub.{UserIdStub, UserStub}

class UserSearchSpec extends AcceptanceSpec {
  "My Application" should {
    "search users" in {
      val userId = UserIdStub.random
      val user = UserStub.create(id = userId)

      createUser(user)

      val response = httpSearchUserCall(userId)

      response.status shouldBe 200
    }

    "return 404 if user not exists" in {
      val response = httpSearchUserCall(UserIdStub.random)

      response.status shouldBe 404
    }
  }
}
