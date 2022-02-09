package com.test;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output


        Scanner val= new Scanner(System.in);

        Long num= Long.parseLong(val.nextLine());
        int count =0;
       
        //solution 1
//        for(int i=1; i<= num; i++){
//
//            if(num % i == 0){
//                count++;
//                if(count > 2){
//                    break;
//                }
//            }
//        }
        
        
        for(int i=1; i<= num/i; i++){

            if(num % i == 0){
                if(i*i == num){
                    count++;
                }else
                    count=count+2;
                if(count > 2){
                    break;
                }
            }
        }

        if(count==2){
            System.out.print("YES");
        }else{
             System.out.print("NO");
        }
        
    }
}
