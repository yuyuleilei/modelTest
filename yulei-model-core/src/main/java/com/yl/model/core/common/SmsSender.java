package com.yl.model.core.common;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/11
 * @description
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}
