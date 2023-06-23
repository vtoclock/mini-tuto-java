package com.oclock.tutojava.zoo;

public class Mesange extends FlyingBird {

    public Mesange(String name) {
        super(name);
    }

    @Override
    public String fly() {
        String message = "[Mesange] I'm flying, yayy!";
        System.out.println(message);
        return message;
    }
    
}
