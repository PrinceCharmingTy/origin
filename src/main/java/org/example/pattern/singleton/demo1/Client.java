package org.example.pattern.singleton.demo1;

public class Client {
    public static void main(String[] args) {
        //创建Singleton类对象
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        //判断两个是否是同一个对象
        System.out.println(s1 == s2);
    }
}
