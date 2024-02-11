package com.assignment1.implementations;

import com.assignment1.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {
    public String makeSound(){
        return "This is Bose Speakers";
    }
}
