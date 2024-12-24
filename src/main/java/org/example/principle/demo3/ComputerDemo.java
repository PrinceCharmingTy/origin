package org.example.principle.demo3;

public class ComputerDemo {
    public static void main(String[] args) {
        HardDisk hardDisk = new XiJieHardDisk();
        Cpu cpu = new IntelCpu();
        Memory memory = new kingstonMemory();
        //
        Computer computer = new Computer();
        //
        computer.setCpu(cpu);
        computer.setMemory(memory);
        computer.setHardDisk(hardDisk);
        //
        computer.run();
    }
}
