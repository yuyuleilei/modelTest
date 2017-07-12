package com.yl.model.core.common.bridge;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/12
 * @description
 */
public class BridgeTest {
    public static void main(String[] args) {
        Bridge bridge = new MyBridge();

        SourceSub1 sourceSub1 = new SourceSub1();
        bridge.setSourceable(sourceSub1);
        bridge.method();

        SourceSub2 sourceSub2 = new SourceSub2();
        bridge.setSourceable(sourceSub2);
        bridge.method();
    }
}
