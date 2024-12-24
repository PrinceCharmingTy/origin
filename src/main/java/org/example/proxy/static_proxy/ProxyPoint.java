package org.example.proxy.static_proxy;

/**
 * 代售点类
 */
public class ProxyPoint implements SellTickets{

    //声明火车站对象
    private TrainStation trainStation = new TrainStation();
    @Override
    public void sell() {
        //增强
        System.out.println("代售点收取服务费用");
        trainStation.sell();
    }
}
