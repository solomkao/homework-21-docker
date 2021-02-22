package com.solomka.docker;

import org.springframework.stereotype.Component;

@Component
public class Repository {

    public String getMessage(){
        return "Hello! I'm from Repository.";
    }
}
