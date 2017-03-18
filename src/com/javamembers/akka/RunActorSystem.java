package com.javamembers.akka;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class RunActorSystem {
	

	public static void main(String[] args) {
		 
		 ActorSystem actorSystem = ActorSystem.create("employeeData");
		 ActorRef ref= actorSystem.actorOf( Props.create( EmployeesActor.class ), "EmployeesActor" );
		 ref.tell("StartApp", ref);
	}

}
