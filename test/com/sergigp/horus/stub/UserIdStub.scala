package com.sergigp.horus.stub

import java.util.UUID

import com.sergigp.horus.domain.user.UserId

object UserIdStub {
  def create(id: UUID = UUID.randomUUID()): UserId = UserId(id)

  def random = create()
}
