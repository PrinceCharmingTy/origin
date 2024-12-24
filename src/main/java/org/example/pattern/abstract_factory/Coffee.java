package org.example.pattern.abstract_factory;

public abstract class Coffee {
    public abstract String getName();

    public void addSugar(){
        System.out.println("addSugar");
    }
    public void addMilk(){
        System.out.println("addMilk");
    }
}
