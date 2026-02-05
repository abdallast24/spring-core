package com.spring.sport.annotations;

import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speaker {

	@Override
	public String makeSound() {
		return "Bose Music";
	}

}
