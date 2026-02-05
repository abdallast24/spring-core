
/* 
 *	This package (com.spring.xml) contains java code that use IOC and DI and creating beans using xml config
 * 
*/
package xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {

		/*
		 * Before Spring framework
		 * 
		 * Sport football = new Football(); System.out.println(football.start());
		 * 
		 * Sport basketball = new BasketBall(); System.out.println(basketball.start());
		 * 
		 * Sport volleyball = new VolleyBall(); System.out.println(volleyball.start());
		 * 
		 * // Factory design patterns
		 * 
		 * Sport football = SportFactory.getFactory("football");
		 * System.out.println(football.start());
		 * 
		 */

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-container.xml");

		/*
		 * Example of IOC
		 * 
		 * Sport sport = context.getBean("sport",Sport.class);
		 * 
		 * System.out.println(sport.start());
		 */

		/*
		 * Example of IOC and DI
		 * 
		 * Coach coach = context.getBean("coach",Coach.class);
		 * 
		 * System.out.println(coach.start());
		 */

		/*
		 * testing bean scopes[singleton - prototype] Coach coach =
		 * context.getBean("coach",Coach.class);
		 * 
		 * System.out.println(coach.start());
		 * 
		 * Coach abdalla = context.getBean("coach",Coach.class);
		 * 
		 * System.out.println(coach == abdalla);
		 * 
		 * Sport coachSport = coach.getSport(); Sport abdallaSport= abdalla.getSport();
		 * 
		 * System.out.println(coachSport == abdallaSport);
		 */

		/*
		 * Testing init-method , destroy-method
		 * 
		 * Coach coach = context.getBean("coach",Coach.class);
		 * 
		 * System.out.println(coach.start());
		 */

		context.close();

	}

}
