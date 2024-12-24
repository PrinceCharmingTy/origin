package org.example.pattern.builder.demo2;

public class Client {
    public static void main(String[] args) {
        //通过build创建手机对象
        Phone phone = new Phone.Builder().cpu("intel")
                .screen("三星屏幕")
                .memory("内存条")
                .mainBoard("华硕主板")
                .build();
        //
        System.out.println(phone);
    }
}
