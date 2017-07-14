package com.yl.model.core.common.observer;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/14
 * @description
 */
public class MySubject extends  AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
