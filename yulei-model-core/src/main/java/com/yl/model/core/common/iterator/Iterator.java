package com.yl.model.core.common.iterator;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/14
 * @description
 */
public interface Iterator {

    public Object previous();

    public Object next();

    public boolean hasNext();

    public Object first();
}
