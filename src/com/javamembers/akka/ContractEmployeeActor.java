package com.javamembers.akka;

import java.util.ArrayList;
import java.util.List;

import akka.actor.UntypedActor;

public class ContractEmployeeActor extends UntypedActor{

	@Override
	public void onReceive(Object msg) throws Exception {
		if(msg instanceof String) {
			System.out.println("<<< Starting  ContractEmployeeActor >>>" );	 
			getSender().tell(getEmployeeDetails(),getSender());			
		}
		
	}
	
	// this can be connected to the service layers to bring data from database/other sources
	private EmployeeDetails getEmployeeDetails(){
		
		List<EmployeeData> empList= new ArrayList<EmployeeData>();
		empList.add(new EmployeeData("John", 30, "Male", "Contract Employee"));
		empList.add(new EmployeeData("Patrick", 32, "Male", "Contract Employee"));
		empList.add(new EmployeeData("Sophia", 32, "female", "Contract Employee"));
		
		EmployeeDetails empDetails = new EmployeeDetails();
		empDetails.setEmpDetails(empList);
		
		return empDetails;
		
		
	}

}
