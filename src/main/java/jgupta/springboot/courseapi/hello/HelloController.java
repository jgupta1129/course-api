package jgupta.springboot.courseapi.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(path="/hi")
	public String sayHi() {
		return "Hi";
	}

	@RequestMapping(path="/hello")
	public String sayHello() {
		return "Hello There!";
	}
}
