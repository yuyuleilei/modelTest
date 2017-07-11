package com.yl.model.core.common;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/11
 * @description
 */
public class AdapterTest {

    public static void main(String[] args) {
//        Targetable targetable = new Adapter();
//        targetable.method1();
//        targetable.method2();
        Source source = new Source();
        Targetable targetable = new Wrapper(source);
        targetable.method1();
        targetable.method2();
    }
}
