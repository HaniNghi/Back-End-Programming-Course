package com.haninghi.homework1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


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
    @GetMapping("/hello")
    public String hello(@RequestParam String location, String name) {
        return "Welcom to the " + location + " " + name + "!" ;
    }

}