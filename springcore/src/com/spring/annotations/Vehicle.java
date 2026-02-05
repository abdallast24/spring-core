/* 
 *	This package (com.spring.annotations) contains java code that use IOC and DI using annotations
 * 
*/

package com.spring.annotations;

import com.spring.sport.annotations.Speaker;
import com.spring.sport.annotations.SpeakerFactory;
import com.spring.sport.annotations.Tyre;
import com.spring.sport.annotations.TyreFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.spring.sport.annotations.BoseSpeakers;
import com.spring.sport.annotations.BridgeStronTyres;
import com.spring.sport.annotations.MichelinTyres;
import com.spring.sport.annotations.SonySpeakers;

@Component("firstVehicle")
@Scope("singleton")
public class Vehicle {
	@Value("${vehicle.name}")
	private String name;
	@Autowired
	@Qualifier("boseSpeakers")
	private Speaker speaker;

	@Autowired
	@Qualifier("bridgeStronTyres")
	private Tyre tyre;

	public Vehicle() {
	}

//	@Autowired
//	public Vehicle(@Qualifier("boseSpeakers") Speaker speaker, @Qualifier("bridgeStronTyres") Tyre tyre) {
//		this.speaker = speaker;
//		this.tyre = tyre;
//	}

	/*
	 * public String makeVehicle() {
	 * 
	 * Speaker boseSpeakers = new BoseSpeakers(); Tyre bridgestronTyres = new
	 * BridgeStronTyres();
	 * 
	 * return "This vehicle contains \n{ " + boseSpeakers.makeSound() + " - " +
	 * bridgestronTyres.rotate() + " }"; }
	 * 
	 * 
	 * public String makeVehicleByFactoryPattern() {
	 * 
	 * 
	 * Speaker speaker = SpeakerFactory.getSpeaker("sony"); Tyre tyre =
	 * TyreFactory.getTyre("michelin");
	 * 
	 * return "This vehicle contains \n{ " + speaker.makeSound() + " - " +
	 * tyre.rotate() + " }";
	 * 
	 * }
	 */

//	public Speaker getSpeaker() {
//		return speaker;
//	}
//
//	@Autowired
//	@Qualifier("sonySpeakers")
//	public void setSpeaker(Speaker speaker) {
//		this.speaker = speaker;
//	}
//
//	public Tyre getTyre() {
//		return tyre;
//	}
//
//	@Autowired
//	@Qualifier("michelinTyres")
//	public void setTyre(Tyre tyre) {
//		this.tyre = tyre;
//	}

	public String getVehicle() {
		return "Vehicle " + name + "->" + speaker.makeSound() + "-" + tyre.rotate();
	}
	
	@PostConstruct
	public void testInitMethod() {
		System.out.println("Vehicle bean creation in init method now\n");
	}
	
	@PreDestroy
	public void testDestroyMethod() {
		System.out.println("\nVehicle bean creation in destroy method now");
	}
}
