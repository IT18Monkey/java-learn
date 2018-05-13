package com.github.it18monkey.enhancements.java5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by whh on 2018/4/2.
 */
public class Generics {
    /**
     * 泛型构造方法格式
     * @param t
     * @param <T>
     */
    public <T> Generics(T t) {

    }

    /**
     * 非静态泛型方法格式
     * @param t
     * @param <T>
     * @return
     */
    public <T> T getNonStatic(T t) {
        return t;
    }

    /**
     * 静态泛型方法格式
     * @param t
     * @param <T>
     */
    public static <T> void getStatic(T t) {

    }

    /**
     * 单个类型限定
     * @param t
     * @param <V>
     */
    public static <V extends Integer> void singleBondedType(V t) {
        System.out.println(t.intValue());
    }

    /**
     * 多个类型限定
     * 类型限定声明中类需要声明在接口前面
     * @param t
     * @param <V>
     */
    public static <V extends Integer & Comparator> void multipleBondedType(V t) {
        System.out.println(t.intValue());
        System.out.println(t.compare(1,2));
    }

    /**
     * 上有界通配符
     * @param list
     */
    public static  void upperBoundedWildcards(List<? extends String> list){

    }

    /**
     * 无界通配符
     * @param list
     */
    public static  void unboundedWildcards(List<?> list){

    }

    /**
     * 下有界通配符
     * @param list
     */
    public static  void lowerBoundedWildcards(List<? super Integer> list){

    }
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
//        list.add(2l);//编译错误
        Integer integer=list.get(0);
        ArrayList rawList=new ArrayList();
        rawList.add(1);
        rawList.add(1l);
        rawList.add("123");
    }
}
