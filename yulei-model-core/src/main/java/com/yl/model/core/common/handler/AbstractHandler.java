package com.yl.model.core.common.handler;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/14
 * @description
 */
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
