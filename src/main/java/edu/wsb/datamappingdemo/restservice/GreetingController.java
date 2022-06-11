package edu.wsb.datamappingdemo.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting prepareResponse(@RequestParam(defaultValue = "World") String name) {
        return new Greeting(0L, name);
    }
}
