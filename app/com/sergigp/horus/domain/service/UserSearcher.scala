package com.sergigp.horus.domain.service

import javax.inject.Inject

import scala.concurrent.Future

import com.sergigp.horus.domain.model.{User, UserId, UserRepository}

class UserSearcher @Inject()(userRepository: UserRepository) {

  def search(userId: UserId): Future[Option[User]] = {
    userRepository.find(userId)
  }
}
