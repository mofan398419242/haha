package com.haha

import akka.actor.{Actor, ActorRefFactory}
import com.haha.web.Index
import spray.routing.{HttpService, RoutingSettings}

/**
 * Created by famo on 8/4/15.
 */
trait MainRoute extends HttpService {
  def mainRoute = {
    get {
      pathPrefix("css") {
        getFromResourceDirectory("css")
      } ~
      pathPrefix("js") {
        getFromResourceDirectory("js")
      } ~
      pathPrefix("img") {
        getFromResourceDirectory("img")
      }
    } ~
    get{
      path("index") {
        complete(Index.getPage)
      }
    }
  }
}

class MainService extends Actor with MainRoute {
  override implicit def actorRefFactory: ActorRefFactory = context

  implicit def executionContext = actorRefFactory.dispatcher

  implicit val rSettings = RoutingSettings.default(context)

  def receive = runRoute(mainRoute)
}
