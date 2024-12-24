package org.example.adapter.object_adapter;

/**
 * 适配器
 */
public interface TFCard {
    //从TF卡中读取数据
    String readTF();
    //往TF卡中写数据
    void writeTF(String msg);
}
