package com.sergigp.horus.domain.user.create

import javax.inject.Inject

import com.sergigp.horus.domain.user.{User, UserId, UserName, UserRepository}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class UserCreator @Inject()(userRepository: UserRepository) {

  def create(userId: UserId, name: UserName): Future[Option[User]] = {

    userRepository.findByName(name).flatMap {
      case Some(existingUser) => Future.successful(None)
      case None =>
        val user = User(userId, name)
        userRepository.create(user).map { _ =>
          Some(user)
        }
    }
  }
}
