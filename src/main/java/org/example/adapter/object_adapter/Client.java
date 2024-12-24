package org.example.adapter.object_adapter;

public class Client {
    public static void main(String[] args) {
        //创建计算机对象
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();

        System.out.println(computer.readSD(sdCard));
        System.out.println("<----------------->");
        //
        TFCard tfCard = new TFCardImpl();
        SDAdapterTF sdAdapterTF = new SDAdapterTF(tfCard);

        System.out.println(computer.readSD(sdAdapterTF));
    }
}
