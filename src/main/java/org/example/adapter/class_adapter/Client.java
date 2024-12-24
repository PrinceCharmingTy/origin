package org.example.adapter.class_adapter;

public class Client {
    public static void main(String[] args) {
        //创建计算机对象
        Computer computer = new Computer();
        //
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);
        System.out.println("<------------------->");
        //使用该电脑读取TF卡中的数据
        //定义适配器类
        String s = computer.readSD(new SDAdapterTF());
        System.out.println(s);
    }
}
