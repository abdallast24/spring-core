package noxml.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Sword implements Weapon{

	@Override
	public String attack() {
		return "Slashing with sowrd 🗡️ ...";
	}

}
