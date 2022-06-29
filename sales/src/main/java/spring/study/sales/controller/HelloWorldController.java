package spring.study.sales.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    @Qualifier("applicationName")
    private String applicationName;

    @Autowired
    @Qualifier("messageApp")
    private String messageApp;

    @GetMapping("/")
    public String helloWorld() {
        return "<h1>" + applicationName + " " + messageApp + "</h1>";
    }
}
