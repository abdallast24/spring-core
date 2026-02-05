package noxml.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Bow implements Weapon {

	@Override
	public String attack() {
		return "shooting arrwow 🏹";
	}

}
