package com.yl.model.core.common.iterator;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/14
 * @description
 */
public class MyCollection implements Collection {
    public String string[] = {"A", "B", "C", "D", "E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
