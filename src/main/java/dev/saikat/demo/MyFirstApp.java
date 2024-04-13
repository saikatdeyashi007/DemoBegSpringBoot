package dev.saikat.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstApp {

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }

    @RequestMapping("/hello/{name}")
    public String sayHelloWithName(@PathVariable("name") String name){
        return "Hello " + name;
    }
}
