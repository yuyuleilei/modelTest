package com.yl.model.core.common.decorator;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/11
 * @description
 */
public class Decorator implements Sourceable {
    private Sourceable sourceable;

    public Decorator(Sourceable sourceable) {
        super();
        this.sourceable = sourceable;
    }

    @Override
    public void method() {

        System.out.println("before decorator!");
        sourceable.method();
        System.out.println("after decorator!");
    }
}
