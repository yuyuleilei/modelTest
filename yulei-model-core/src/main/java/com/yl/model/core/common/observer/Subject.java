package com.yl.model.core.common.observer;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/14
 * @description
 */
public interface Subject {

    public void add(Observer observer);

    public void del(Observer observer);

    public void notifyObservers();

    public void operation();

}
