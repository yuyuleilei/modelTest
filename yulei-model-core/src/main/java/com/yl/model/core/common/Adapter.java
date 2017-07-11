package com.yl.model.core.common;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/11
 * @description
 */
public class Adapter extends Source implements Targetable {


    @Override
    public void method2() {
        System.out.println("this is targetable method!");
    }
}
