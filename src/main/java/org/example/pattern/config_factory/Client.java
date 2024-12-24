package org.example.pattern.config_factory;

public class Client {
    public static void main(String[] args) {

        Coffee coffee = CoffeeFactory.getCoffee("american");
        System.out.println(coffee.getName());
    }
}
