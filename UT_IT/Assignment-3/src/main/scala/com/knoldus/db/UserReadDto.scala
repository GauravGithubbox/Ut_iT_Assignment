package com.knoldus.db

import com.knoldus.models.User
import scala.collection.immutable.HashMap

 class UserReadDto {
  val user1: User = User("Gaurav","srivastav",24,"knoldus","Gaurav.srivastav@gmail.com")
  val user2: User = User("pavan","negi",26,"knoldus","pavan.negi@knoldus.com")


  val users: HashMap[String, User] = HashMap("Gaurav" -> user1, "pavan" -> user2)
  def getUserByName(name: String): Option[User] = users.get(name)
}
