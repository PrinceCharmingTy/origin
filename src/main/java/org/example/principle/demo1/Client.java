package org.example.principle.demo1;

public class Client {
    public static void main(String[] args) {
        //
        SougouInput sougouInput = new SougouInput();
        //
        DefaultSkin skin = new DefaultSkin();
        //
        sougouInput.setSkin(skin);
        sougouInput.display();
    }
}
