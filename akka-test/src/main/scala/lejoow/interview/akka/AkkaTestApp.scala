package lejoow.interview.akka

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import akka.actor._
import akka.pattern.ask
import akka.util.Timeout
/**
  * Created by jooan on 28/4/2017.
  */
object Main extends App{

  val system = ActorSystem("HelloSystem")
  val helloActor = system.actorOf(Props[HelloActor], name = "helloActor")
  helloActor ! "hello"
  helloActor ! "bye"


}

class HelloActor extends Actor{
  override def receive: Receive = {
    case "hello" => println("hello back at you")
    case _ => println("huh?")
  }
}
