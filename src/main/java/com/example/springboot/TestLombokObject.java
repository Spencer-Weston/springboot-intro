package com.example.springboot;


import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


import java.io.Serializable;

@Getter @Setter @NoArgsConstructor
public class TestLombokObject implements Serializable {

    private Long id;
    private String name;
    private String description;

    public TestLombokObject(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    ;
}
