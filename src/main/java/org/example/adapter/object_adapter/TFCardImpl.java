package org.example.adapter.object_adapter;

/**
 * 适配者类
 */
public class TFCardImpl implements TFCard {
    public String readTF(){
        String msg = "This is a TF card";
        return "This is a TF card";
    }
    public void writeTF(String msg){
        System.out.println("TFCard write msg:" + msg);
    }
}
