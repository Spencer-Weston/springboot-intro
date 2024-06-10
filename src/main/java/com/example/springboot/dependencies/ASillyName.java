package com.example.springboot.dependencies;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ASillyName {
    private String name;
    public ASillyName(String name) {
        this.name = ASillyFunction(name);
    }

    private String ASillyFunction(String name) {
        var modified_name = name + "His or her highest royal highness";
        return modified_name;
    }
}
