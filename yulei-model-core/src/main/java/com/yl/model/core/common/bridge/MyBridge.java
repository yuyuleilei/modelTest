package com.yl.model.core.common.bridge;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/12
 * @description
 */
public class MyBridge extends Bridge {

    public void method(){
        getSourceable().method();
    }
}
