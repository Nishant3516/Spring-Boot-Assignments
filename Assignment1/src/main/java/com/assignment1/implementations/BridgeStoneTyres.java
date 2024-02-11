package com.assignment1.implementations;

import com.assignment1.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyres implements Tyres {
    public String rotate(){
        return "This is BridgeStoneTyres";
    }
}
