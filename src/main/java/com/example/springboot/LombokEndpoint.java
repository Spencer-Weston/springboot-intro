package com.example.springboot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LombokEndpoint {
    @GetMapping("/lombok")
    public TestLombokObject index() {
        TestLombokObject testObject = new TestLombokObject(1L, "Spencer", "An instance of Spencer");
//        String testObject = "asdfasdf";
        return testObject;
    }
}
