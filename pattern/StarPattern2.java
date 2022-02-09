package com.pattern;

import java.util.Scanner;

public class StarPattern2 {

	public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();

        for(int i=num;i>=1;i--){
            if(i == num || i==1){
            	//System.out.println("aaa");
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            }else{
            	//System.out.println("bbb");
                int star=2;
                for(int j=1;j<=i;j++){
                     if(j == i || j==1){
                         System.out.print("*");
                     }else{
                         System.out.print(" ");
                     }
                }
            }
            System.out.println();

        }
        
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaa");

    }
}
