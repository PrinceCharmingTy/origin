package org.example.principle.demo2;

public class RectangleDemo {
    public static void main(String[] args) {

    }
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getHeight()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }
    public static void printLengthAndWith(Rectangle rectangle) {
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getHeight());
    }
}
