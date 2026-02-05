/* 
 *	This package (noxml) contains java code that use IOC and DI and creating beans without using any xml config
*/

package noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import noxml.beans.Gun;
import noxml.beans.Weapon;

@Configuration
@PropertySource("classpath:data.properties")
@ComponentScan("noxml")
public class SpringConfig {
	
	@Bean
	public Weapon getGunObject() {
		return new Gun();
	}
}
