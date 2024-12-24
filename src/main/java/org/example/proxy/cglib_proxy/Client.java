package org.example.proxy.cglib_proxy;

public class Client {
    public static void main(String[] args) {
        //创建工厂
        ProxyFactory proxyFactory = new ProxyFactory();
        //获取代理对象
        TrainStation proxyObject = proxyFactory.getProxyObject();
        //调用Sell方法卖票
        proxyObject.sell();
    }
}
