package com.springboot.spp;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
@EnableAutoConfiguration
@RestController
public class HelloWorldController extends SpringbootBackendApplication {
	//GET HTTP method
   @GetMapping("/hello-world")
   public String helloWorld() {
	   return "Hello World";
   }
}
