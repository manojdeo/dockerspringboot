package com.ssbmg.docker.app.resouece;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerTestResource {

	@GetMapping("/testDocker")
	public String testDocker() {
		return "docker Access tested";
	}

}
