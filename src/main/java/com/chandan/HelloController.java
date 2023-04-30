package com.chandan;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

//https://docs.spring.io/spring-boot/docs/current/reference/html/howto-logging.html
@RestController
public class HelloController {

    private static final Logger logger = LogManager.getLogger(HelloController.class);

    @GetMapping("/")
    public String hello() {
     logger.debug("Debug - Hello from Logback");
     logger.info("Info - Hello from Logback");
  
     return "Hello World!!!!";
    }
   @GetMapping("/home/{name}")
    public String home(@PathVariable String name) {
     logger.debug("Debug - Hello from Home");
     logger.info("Info - Hello from Home");
     if(!"Chandan".equals(name)){
     	logger.error("***Error Occurs***");
     }
     return "Welcome "+name;
    }

}
