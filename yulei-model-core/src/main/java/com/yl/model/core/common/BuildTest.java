package com.yl.model.core.common;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/11
 * @description
 */
public class BuildTest {

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
    }
}
