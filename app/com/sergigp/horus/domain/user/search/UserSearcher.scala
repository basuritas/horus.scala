package com.sergigp.horus.domain.user.search

import javax.inject.Inject

import com.sergigp.horus.domain.user.{User, UserId, UserRepository}

import scala.concurrent.Future

class UserSearcher @Inject()(userRepository: UserRepository) {

  def search(userId: UserId): Future[Option[User]] = {
    userRepository.find(userId)
  }
}
