package noxml.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Gun implements Weapon {

	@Override
	public String attack() {
		return "shooting bullets 🔫 ...";
	}

}
