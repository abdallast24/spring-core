package com.spring.sport.xml;

public class SportFactory {

	public static Sport getFactory(String sport) {
		if (sport.equalsIgnoreCase("football"))
			return new Football();
		else if (sport.equalsIgnoreCase("basketball"))
			return new BasketBall();
		else if (sport.equalsIgnoreCase("volleyball"))
			return new VolleyBall();

		return null;
	}
}
