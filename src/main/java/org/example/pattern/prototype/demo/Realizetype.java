package org.example.pattern.prototype.demo;

public class Realizetype implements Cloneable{
    public Realizetype() {
        System.out.println("Realizetype");
    }
    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("Realizetype cloned");
        return (Realizetype) super.clone();
    }
}
