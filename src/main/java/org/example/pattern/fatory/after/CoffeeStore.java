package org.example.pattern.fatory.after;



public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        //声明coffee类型的变量
        //根据不同类型创建不同的coffee子类对象

        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
