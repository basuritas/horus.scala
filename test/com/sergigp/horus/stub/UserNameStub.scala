package com.sergigp.horus.stub

import com.sergigp.horus.domain.user.UserName
import com.sergigp.horus.infrastructure.StringStub

object UserNameStub {
  def create(name: String = StringStub.random(6)): UserName = UserName(name)

  def random = create()
}
