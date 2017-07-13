package com.yl.model.core.common.strategy;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/13
 * @description
 */
public class Plus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp, "\\+");
        return arrayInt[0] + arrayInt[1];
    }
}
