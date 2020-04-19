package application.buoi1;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }

    public static int bai1(int n){
        return n*(n+1)/2;
    }

    public static int bai2(int a, int b){
        int result = (a+b + Math.abs(a-b))/2;
        return result;
    }

    public static void bai3(String name){
        System.out.println(name);
    }

}
