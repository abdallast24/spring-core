package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * The old way of initializing an object & using the factory pattern!
		 * 
		 * Vehicle vehicle = new Vehicle();
		 * System.out.println(vehicle.makeVehicle());
		 * 
		 * System.out.println(vehicle.makeVehicleByFactoryPattern());
		 */
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-container.xml");
		
		
//		  Vehicle vehicle = context.getBean("firstVehicle",Vehicle.class);
//		  
//		  Vehicle vehicleTwo = context.getBean("firstVehicle",Vehicle.class);
//		  
//		  if(vehicle == vehicleTwo) System.out.println("singleton scope");
//		  else 
//			  System.out.println("prototype scope");
		
//		Vehicle vehicle = context.getBean("firstVehicle",Vehicle.class);
//		System.out.println(vehicle.getVehicle());

		context.close();
	}

}
