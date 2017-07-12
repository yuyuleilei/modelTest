package com.yl.model.core.common.bridge;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/12
 * @description
 */
public abstract class Bridge {

    private Sourceable sourceable;

    public void method(){
        sourceable.method();
    }

    public Sourceable getSourceable() {
        return sourceable;
    }

    public void setSourceable(Sourceable sourceable) {
        this.sourceable = sourceable;
    }
}
