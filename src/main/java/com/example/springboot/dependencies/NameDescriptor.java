package com.example.springboot.dependencies;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


@Getter @Setter @NoArgsConstructor
public class NameDescriptor {
    private Long id;
    private String name;
    private String description;
}
