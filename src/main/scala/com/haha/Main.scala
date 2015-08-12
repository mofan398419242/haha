package com.haha

import akka.actor.{ActorSystem, Props}
import akka.io.IO
import spray.can.Http

/**
 * Created by famo on 8/4/15.
 */
object Main extends App{
  implicit val system = ActorSystem("haha")

  val mainService = system.actorOf(Props[MainService],"mainService")

  IO(Http) ! Http.Bind(mainService,"127.0.0.1",port=8080)
}
