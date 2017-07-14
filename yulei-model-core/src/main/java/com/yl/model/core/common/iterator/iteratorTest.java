package com.yl.model.core.common.iterator;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/14
 * @description
 */
public class iteratorTest {
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator iterator = collection.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
