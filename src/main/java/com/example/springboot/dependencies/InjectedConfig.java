package com.example.springboot.dependencies;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import com.example.springboot.dependencies.ASillyDescription;
//import com.example.springboot.dependencies.ASillyName;

@Configuration
public class InjectedConfig {

    @Bean
    public ASillyDescription aSillyDescription() {
        return new ASillyDescription("The silliest name ever");
    }

    @Bean
    public ASillyName aSillyName() {
        return new ASillyName();
    }


}
