package noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Player player = context.getBean("myplayer",Player.class);
		System.out.println(player.fight());
		
		context.close();
	}
}
