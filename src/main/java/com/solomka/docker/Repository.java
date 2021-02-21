package com.solomka.docker;

import org.springframework.stereotype.Component;

@Component
public class Repository {

    public String getSong(){
        return "I'm from Repository";
    }
}
