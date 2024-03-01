package com.directi.training.dip.exercise.sol;

import java.util.Base64;

public class Base64Encoder implements Encoder{

    public String encode(String string){
        String encoded = "";
        String[] lines = string.split("\n");
        for(String line : lines){
            encoded =+Base64.getEncoder().encodeToString(line);
        }
        return encoded;
    }

}
