package org.example.pattern.factory_method;

public abstract class Coffee {
    public abstract String getName();

    public void addSugar(){
        System.out.println("addSugar");
    }
    public void addMilk(){
        System.out.println("addMilk");
    }
}
