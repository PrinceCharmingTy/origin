package org.example.pattern.factory_method;

public class CoffeeStore {

    public CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory){
        this.factory = factory;
    }

    public Coffee orderCoffee(){
        //
        Coffee coffee = factory.createCoffee();
        //
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
