package com.yl.model.core.common;

import java.io.*;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/11
 * @description
 */
public class Prototype implements Cloneable, Serializable {
    private static final long serialVersionUID = -2772662633559597396L;

    private String string;

    private SerializableObject obj;

    public Object clone() throws CloneNotSupportedException{
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }

    public Object deepClone() throws IOException, ClassNotFoundException{
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }
}

class SerializableObject implements Serializable {
    private static final long serialVersionUID = 1L;
}
