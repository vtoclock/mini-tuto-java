package com.oclock.tutojava.zoo;

public class SuperMesange extends Mesange implements SuperBird {

    public SuperMesange(String name) {
        super(name);
    }

    @Override
    public String fly() {
        String message = "[SuperMesange] I'm flying so high, yayy!";
        System.out.println(message);
        return message;
    }

    @Override
    public void superPiou() {
        System.out.println("I'm so gnarly!");
    }

    public void talk(String word) {
        System.out.println("I'm so " + word + "!");
    }

}
