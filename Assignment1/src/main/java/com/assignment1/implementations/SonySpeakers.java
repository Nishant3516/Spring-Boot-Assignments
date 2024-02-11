package com.assignment1.implementations;

import com.assignment1.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {
    public String makeSound(){
        return "This is Sony Speakers";
    }
}
