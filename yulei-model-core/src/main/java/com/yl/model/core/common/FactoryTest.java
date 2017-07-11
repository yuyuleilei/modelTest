package com.yl.model.core.common;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/11
 * @description
 */
public class FactoryTest {
    public static void main(String[] args) {
//        SendFactory factory = new SendFactory();
//        Sender sender = factory.produce("sms");
//        sender.send();
//
//        Sender senderMail = factory.produceMail();
//        senderMail.send();
//        Sender sender = SendFactory.produceSms();
//        sender.send();
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
