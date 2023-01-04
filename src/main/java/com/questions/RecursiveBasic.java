package com.questions;

public class RecursiveBasic {
    public static void main(String[] args) {
        f(10);
        System.out.println("toplam(20) = " + toplam(10));
    }
    public static void f(int num ){
        if (num>1){
            f(num-1);
        }
        System.out.println("num = " + num);

    }
    public static int toplam(int i){
        int toplam;
        if (i>0){
            toplam(i-1);
        }else
            return 0;
        return i + toplam(i-1);

    }
}
