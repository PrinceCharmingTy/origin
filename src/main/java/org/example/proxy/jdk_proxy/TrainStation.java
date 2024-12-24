package org.example.proxy.jdk_proxy;

/**
 * 火车站
 */

public class TrainStation implements SellTickets {
    @Override
    public void sell(String ticket) {
        System.out.println("售卖车票:" + ticket);
        System.out.println("火车站买票");
    }
}
