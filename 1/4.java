package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();
        System.out.print("Input c: ");
        int c = in.nextInt();
        int s = a + b + c;
        if(s > 0) {
            System.out.println("Сума чисел додатна!");
        }else if (s < 0){
            System.out.println("Сума чисел від'ємна!");
        }else if (s == 0){
            System.out.println("Сума чисел дорівнює нулю!");
        }


    }
}
