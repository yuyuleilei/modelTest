package com.yl.model.core.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/11
 * @description
 */
public class Builder {
    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count){
        for (int i = 0; i < count ; i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for (int i = 0; i < count ; i++){
            list.add(new SmsSender());
        }
    }
}
