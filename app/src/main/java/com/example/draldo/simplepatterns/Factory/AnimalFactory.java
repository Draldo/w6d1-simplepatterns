package com.example.draldo.simplepatterns.Factory;

/**
 * Created by Draldo on 22/08/2016.
 */
public class AnimalFactory {

    public Fish createFish(){
        return new Fish();
    }

    public Mammal createMammal(){
        return new Mammal();
    }
}
