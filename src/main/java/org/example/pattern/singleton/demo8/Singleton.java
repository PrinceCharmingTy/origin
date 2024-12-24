package org.example.pattern.singleton.demo8;

public class Singleton {
    private static Singleton instance;
    private static Boolean flag = false;
    private Singleton() {
        //
        synchronized (Singleton.class) {
            if (flag){
                throw new RuntimeException("不能多次创建单例对象");
            }
            flag = true;
        }
    }
    public static class SingletonHandler {
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance() {
        return SingletonHandler.INSTANCE;
    }
}
