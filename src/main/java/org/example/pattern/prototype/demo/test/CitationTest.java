package org.example.pattern.prototype.demo.test;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        //
        Student stu = new Student();
        stu.setName("张三");
        citation.setStu(stu);
        Citation citation1 = citation.clone();
        citation1.getStu().setName("李四");
        //
//        citation.setName("zhang");
//        clone.setName("li");
        //
        citation.show();
        citation1.show();
    }
}
