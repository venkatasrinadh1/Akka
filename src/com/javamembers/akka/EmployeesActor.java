package com.javamembers.akka;

import java.util.ArrayList;
import java.util.List;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;

public class EmployeesActor extends UntypedActor{
	

	 int counter=0;
	 List<EmployeeData> empList= null;
	 
	@Override
	public void onReceive(Object msg) throws Exception {
		
		// create Actor reference for the sub actors
		ActorRef perRef= getContext().actorOf( Props.create(PermenantEmployeeActor.class));
		ActorRef conRef= getContext().actorOf( Props.create(ContractEmployeeActor.class));	
		
		if(msg instanceof String){
			empList=new ArrayList<EmployeeData>();
			counter=0;  				
			perRef.tell(msg, getSelf());
			conRef.tell(msg, getSelf());
		}
		
		else if(msg instanceof EmployeeDetails){
			++counter;
			System.out.println("Counter ==>"+counter);			
			EmployeeDetails details =(EmployeeDetails) msg;
			empList.addAll(details.getEmpDetails());           
            if(counter==2){
	            System.out.println("the products size==>"+empList.size());  
	            for(EmployeeData data : empList){
	            	System.out.println(data.getName()+","+ data.getAge()+","+data.getSex()+","+data.getEmployeeType());
	            }
            }
		}else{
            unhandled( msg );
        }
		
		
	}
	
	
	
	

}
