package org.example.pattern.prototype.demo.test1;

import java.io.*;

public class CitationTest {
    public static void main(String[] args) throws Exception {
        Citation citation = new Citation();
        //
        Student stu = new Student();
        stu.setName("张三");
        citation.setStu(stu);

        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\test1.txt"));
        //写对象
        oos.writeObject(citation);
        //
        oos.close();

        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\test1.txt"));
        //读取对象
        Citation citation1 = (Citation) ois.readObject();
        //释放资源
        ois.close();
        citation1.getStu().setName("李四");

        citation.show();
        citation1.show();
    }
}
