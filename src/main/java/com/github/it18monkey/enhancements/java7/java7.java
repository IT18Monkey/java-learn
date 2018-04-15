package com.github.it18monkey.enhancements.java7;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by whh on 2018/4/1.
 */
public class java7 {
    public static String testTryWith() throws Exception {
        /*
            声明在try括号中的对象称为资源，在方法执行完毕后会被自动关闭。
            所有实现java.lang.AutoCloseable接口的类都可以当作资源。
            相对与之前必须在finally关闭资源，这一特性大大提高了代码的简洁性。
         */
        try (BufferedReader reader=new BufferedReader(new FileReader("d:1.txt"))){
            return reader.readLine();
        }
    }
    public static void main(String[] args) {
        //二进制字面值前缀0b 或0B
        int i = 0b010;
        int j = 0B010;
        System.out.println(i);
        System.out.println(i=j);
        //数字间的下划线不影响实际值
        int k = 1_1;
        System.out.println(k);
    }


}
