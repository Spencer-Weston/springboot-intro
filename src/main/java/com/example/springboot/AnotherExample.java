
package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherExample {

    @GetMapping("/radical")
    public String index() {
        return "This is radical!";
    }
}
