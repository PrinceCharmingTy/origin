package org.example.principle.demo3;

public class XiJieHardDisk implements HardDisk{
    @Override
    public void save(String data) {
        System.out.println("Save data: " + data);
    }

    @Override
    public String get() {
        System.out.println("Get data");
        return "data";
    }
}
