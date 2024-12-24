package org.example.pattern.prototype.demo.test;

public class Citation implements Cloneable{
    //
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
    private Student stu;

    public Student getStu() {
        return stu;
    }
    public void setStu(Student stu) {
        this.stu = stu;
    }

    public void show(){
        System.out.println(stu.getName() + "获奖");
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
