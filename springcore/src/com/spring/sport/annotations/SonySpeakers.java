package com.spring.sport.annotations;

import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speaker {

	@Override
	public String makeSound() {
		return "Sony Music";
	}

}
