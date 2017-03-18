package com.javamembers.akka;

import java.util.ArrayList;
import java.util.List;

import akka.actor.UntypedActor;

public class PermenantEmployeeActor extends UntypedActor{

	@Override
	public void onReceive(Object msg) throws Exception {
		
		if(msg instanceof String) {
			System.out.println("<<< Starting  PermenantEmployeeActor>>>");	 
			getSender().tell(getEmployeeDetails(),getSender());			
		}
	}
	
	// this can be connected to the service layers to bring data from database/other sources
		private EmployeeDetails getEmployeeDetails(){
			
			List<EmployeeData> empList= new ArrayList<EmployeeData>();
			empList.add(new EmployeeData("Smith", 30, "Male", "Permenant Employee"));
			empList.add(new EmployeeData("Adnan", 32, "Male", "Permenant Employee"));
			empList.add(new EmployeeData("Isabella", 32, "female", "Permenant Employee"));
			
			EmployeeDetails empDetails = new EmployeeDetails();
			empDetails.setEmpDetails(empList);
			
			return empDetails;
			
			
		}

}
