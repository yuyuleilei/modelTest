package com.yl.model.core.common.iterator;


/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/14
 * @description
 */
public interface Collection {
    public Iterator iterator();

    public Object get(int i);

    public int size();
}
