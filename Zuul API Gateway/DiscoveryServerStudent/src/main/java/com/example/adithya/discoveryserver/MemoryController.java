package com.example.adithya.discoveryserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MemoryController {

	@GetMapping("/memory")
	public String memoryDetails() {
		Runtime runtime = Runtime.getRuntime();
		int totalMemory = (int)runtime.totalMemory();
        int freeMem = (int) (runtime.freeMemory());
		return "Welcome to Eureka Server, total memory "+totalMemory+ ", Free Memory "+freeMem;
		
	}
}
