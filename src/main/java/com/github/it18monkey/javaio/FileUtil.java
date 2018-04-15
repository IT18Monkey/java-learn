package com.github.it18monkey.javaio;

import java.io.File;

/**
 * Created by whh on 2018/3/11.
 */
public class FileUtil {
    /**
     * File类学习
     *
     *  java中File来表示一个文件的引用
     */
    public static void fileTest() {
        File file=new File("");
        System.out.println(file.length());
        System.out.println(file.getAbsoluteFile());
    }

    public static void main(String[] args) {
        fileTest();
    }
}
