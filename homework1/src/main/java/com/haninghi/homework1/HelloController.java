package com.haninghi.homework1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String greeting() {
		return "Greetings from Spring Boot!";
	}
    @GetMapping("/index")
    public String index() {
        return "This is the main page";
    }
    @GetMapping("/contact")
    public String contact() {
        return "This is the contact page";
    }
}