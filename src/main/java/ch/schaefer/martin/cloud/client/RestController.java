package ch.schaefer.martin.cloud.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Lunar Module controller.
 * 
 * @author Martin Schäfer
 *
 */
@Controller
public class RestController {

	private final SpringBootServiceClient client;

	public RestController(SpringBootServiceClient client) {
		this.client = client;
	}

	/**
	 * Say hello to earth
	 * 
	 * @return First word from the moon
	 * 
	 */
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Message from Lunar Module: " + client.getHello();
	}
}
