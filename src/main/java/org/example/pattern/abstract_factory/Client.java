package org.example.pattern.abstract_factory;

public class Client {
    public static void main(String[] args) {
        //创建意大利
        ItalyDessertFactory factory = new ItalyDessertFactory();

        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();
    }
}
