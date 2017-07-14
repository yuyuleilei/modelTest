package com.yl.model.core.common.handler;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/14
 * @description
 */
public class MyHandler extends  AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name + " deal!");
        if(getHandler() != null){
            getHandler().operator();
        }
    }
}
