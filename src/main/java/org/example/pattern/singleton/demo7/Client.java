package org.example.pattern.singleton.demo7;

import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception {
            writeObject2File();
        readObjectFromFile();
    }
    public static void readObjectFromFile() throws Exception {
        //
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\test\\object2.txt"));
        //
        Singleton o = (Singleton) ois.readObject();
        //
        System.out.println(o);
        ois.close();
    }
    //向文件中写数据
    public static void writeObject2File() throws Exception {
        //1.获取singleton对象
        Singleton instance = Singleton.getInstance();
        //2,创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\test\\object2.txt"));
        //3.写对象
        oos.writeObject(instance);
        System.out.println(instance);
        oos.close();
    }
}
