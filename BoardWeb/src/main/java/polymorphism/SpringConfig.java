package polymorphism;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringConfig {

	@Bean
	public SamsungTV samsungTV() {
		SamsungTV sm = new SamsungTV();
		sm.setPrice(20000);
		return sm;
	}
	
	@Bean
	public AppleSpeaker appleSpeaker() {
		
		return new AppleSpeaker();
	}
}
