package ch.schaefer.martin.cloud.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("openshift-spring-boot-service")
public interface SpringBootServiceClient {

	@GetMapping("/hello")
	String getHello();
}
