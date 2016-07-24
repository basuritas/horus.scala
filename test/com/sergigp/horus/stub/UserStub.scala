package com.sergigp.horus.stub

import com.sergigp.horus.domain.model.{UserId, UserName}
import com.sergigp.horus.domain.user.{User, UserId, UserName}

object UserStub {
  def create(id: UserId = UserIdStub.random, name: UserName = UserNameStub.random): User = {
    User(id, name)
  }

  def random: User = create()
}
