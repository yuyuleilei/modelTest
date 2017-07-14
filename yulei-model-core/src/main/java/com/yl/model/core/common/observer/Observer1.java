package com.yl.model.core.common.observer;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/14
 * @description
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}
