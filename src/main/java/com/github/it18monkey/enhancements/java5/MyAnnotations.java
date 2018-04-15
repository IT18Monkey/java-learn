package com.github.it18monkey.enhancements.java5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by whh on 2018/4/1.
 */
//注释注解的注解又叫做元注解
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotations {
    //注解内可以添加方法，也可以不添加
    //注解方法的返回值只能是基本类型，String，Class类,枚举,注解,可以有默认值
    int id();
    String name() default "whh";
    Class classType();
    TestEnum enumType();
}
