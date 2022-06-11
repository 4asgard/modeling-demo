package edu.wsb.datamappingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ModelingDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(ModelingDemoApplication.class, args);

    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/api/demo")
    public String prepareResponse(@RequestParam String string) {
        return "Wpisano: " + string;
    }
}
