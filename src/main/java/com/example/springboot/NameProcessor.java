package com.example.springboot;
import com.example.springboot.dependencies.ASillyDescription;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/name")
public class NameProcessor {

    private ASillyDescription aSillyDescription;

    @GetMapping("/{name}")
    public String returnName(@PathVariable String name) {
        return "Hello, " + name + "!" + aSillyDescription.getDescription();
    }
}

