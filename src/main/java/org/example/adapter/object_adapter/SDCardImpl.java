package org.example.adapter.object_adapter;

public class SDCardImpl implements SDCard {
    public String readSD() {
        String msg = "SDCard is reading: hello word SD";
        return msg;
    }

    public void writeSD(String sd) {
        System.out.println("SDCard is writing:" + sd);
    }
}
