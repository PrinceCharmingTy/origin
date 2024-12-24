package org.example.proxy.jdk_proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 获取代理对象的工厂类
 * 代理类也实现了对应的接口
 */
public class ProxyFactory {
    private TrainStation station = new TrainStation();
    //声明目标对象
    public SellTickets getProxyObject(){
        //返回代理对象即可
        /**
         * ClassLoader loader:类加载器，用于加载代理类。可以通过目标对象获取对象类加载器
         * Class<?>[] interfaces:代理类实现接口的字节码对象
         * InvocationHandler h: 代理对象的调用处理程序++
         * */
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * Object proxy: 代理对象。和proxyObject对象是同一个对象，在invoke方法中基本不用
                     * Method method: 对接口中的方法进行封装的method对象
                     * Object[] args: 调用方法的实际参数
                     */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //对象方法的增强
                        System.out.println("invoke method");
                        //执行目标对象的方法
                        return method.invoke(station, args);
                    }
                }
        );
        return proxyObject;
    }
}