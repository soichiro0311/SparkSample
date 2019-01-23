package spring.sample;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	private static Timer timer = new Timer();

	@GetMapping("/")
	public String index() {
		timer.countUp();
		return "OK";
	}
	
	static class Timer{
    	private int counter = 0;
    	public void countUp() {
    		counter++;
    		if(counter == 1) {
        		System.out.println(LocalDateTime.now());
        	}
        	
        	if(counter == 10000) {
        		System.out.println(LocalDateTime.now());
        	}
    	}
    }
}