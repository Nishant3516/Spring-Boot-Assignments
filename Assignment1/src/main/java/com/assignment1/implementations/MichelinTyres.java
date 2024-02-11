package com.assignment1.implementations;

import com.assignment1.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyres {

    public String rotate() {
        return "This is Michelin tyres";
    }
}
