package com.example.springboot.dependencies;

import lombok.Getter;
import lombok.Setter;


import com.example.springboot.ApplicationConfig;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;


@Getter @Setter
public class ASillyDescription implements Serializable {
    private String description;

    private ApplicationConfig applicationConfig;

    @Autowired
    public void InjectedConfig(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
    }

    //Create a name descriptor
    public ASillyDescription(String description) {
        this.description = ASillyFunction(this.applicationConfig.getDefaultDescription());
    }

    public ASillyDescription() {
        this.description = ASillyFunction("Wrong Path");
    }

    private String ASillyFunction(String description) {
        var modified_description = description + "22";
        return description;
    }
}