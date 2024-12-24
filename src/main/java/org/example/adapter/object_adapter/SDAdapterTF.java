package org.example.adapter.object_adapter;

/**
 * 适配器类
 */
public class SDAdapterTF implements SDCard {

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String sd) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(sd);
    }
}
