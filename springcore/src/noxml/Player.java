package noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import noxml.beans.Weapon;

@Component("myplayer")
@Scope("prototype")
public class Player {
	@Value("${warrior.name}")
	private String name;
	@Value("#{2*12}") // trying to use spring expression language :)
	private int age;
	private Weapon weapon;

	@Autowired
	public Player(@Qualifier("getGunObject") Weapon weapon) {
		this.weapon = weapon;
	}

	public String fight() {
		return "I am " + name + " , I have " + age + " years old -> " + weapon.attack();
	}
}
