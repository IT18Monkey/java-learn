package com.github.it18monkey.enhancements.java5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by whh on 2018/3/27.
 */
public class java5 {
    /**
     * 泛型测试
     */
    public void testGenerics() {
        List<Integer> list = new ArrayList<Integer>();
    }
    /**
     * 测试switch是否支持枚举
     * @param testEnum
     */
    public static void tetEnum(TestEnum testEnum) {
        switch (testEnum) {
            case one:
                System.out.println("enum one");
                break;
            case two:
                System.out.println("enum two");
                break;
        }
    }

    /**
     * 增强for测试
     */
    public void testEnhancedFor() {
        int[] array = {1, 2, 3, 4, 5};
        for (int i : array) {
            System.out.println(i);
        }
    }

    /**
     * 可变参数测试
     *
     * @param args
     */
    public static void testVarargs(String... args) {
        //本质就是个数组
        System.out.println(args[1]);
        for (String arg : args) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        testVarargs("1","2");
        tetEnum(TestEnum.two);

    }

}
