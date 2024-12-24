package org.example.proxy.cglib_proxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理对象工厂 用来获取代理对象
 */
public class ProxyFactory implements MethodInterceptor {

    private TrainStation station = new TrainStation();

    public TrainStation getProxyObject(){
        //创建Enhancer对象,类似于jdk代理中的proxy类
        Enhancer enhancer = new Enhancer();
        //设置父类字节码对象
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //增强方法
        System.out.println("方法增强");
        //要调用目标对象的方法
        return method.invoke(station, objects);
    }
}
