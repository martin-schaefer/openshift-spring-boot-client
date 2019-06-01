package ch.schaefer.martin.cloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * The Lunar Module's main ignition routine.
 * 
 * @author Martin Schäfer
 */
@SpringBootApplication
@EnableFeignClients
public class BurnBabyBurn {

	public static void main(String[] args) {
		SpringApplication.run(BurnBabyBurn.class, args);
	}

}
