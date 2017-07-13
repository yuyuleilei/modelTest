package com.yl.model.core.common.strategy;

/**
 * @author Yulei
 * @version 1.0
 * @date 2017/7/13
 * @description
 */
public class StrategyTest {
    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println("result:" + result);
    }
}
