package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        
        System.out.println("Neparni chisla:");
        for (int i = 1; i < a; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println(" "); 
        
        System.out.println("Parni chisla:");
        for (int c = 1; c < a; c++) {
            if (c % 2 == 0) {
                System.out.print(c + " ");
            }
        }
        

        }

    }

