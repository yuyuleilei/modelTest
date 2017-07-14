package com.yl.model.core.common.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/14
 * @description
 */
public abstract class AbstractSubject implements Subject {

    private Vector<Observer> vector = new Vector<Observer>();

    @Override
    public void add(Observer observer){
        vector.add(observer);
    }

    @Override
    public void del(Observer observer){
        vector.remove(observer);
    }

    @Override
    public void notifyObservers(){
        Enumeration<Observer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            enumeration.nextElement().update();
        }
    }

}
