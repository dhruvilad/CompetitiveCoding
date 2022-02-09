package com.pattern;

import java.util.Scanner;

public class StarPattern1 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner scan=new Scanner(System.in);

        int num=scan.nextInt();

       for(int i=num;i>=1; i--){
	            int starcount=i*2;
	            int spacecount = (num-i)*2;
	            int start=0;
	            for(int j=1;j<=num*2;j++){
	                /*if(j != 0 && starcount/j == spacecount){
	                    System.out.print("#");
	                    start++;
	                }else if(spacecount >start && start != 0){
	                    System.out.print("&");
	                    start++;
	                }*/
	            	if(j>i && start <spacecount) {
	            		System.out.print(" ");
	            		 start++;
	            	}else{
	            	
	                    System.out.print("*");
	                }                
	            }
	            System.out.println();
	        }
	        for(int i=1;i<=num; i++){
	            int starcount=i*2;
	            int spacecount = (num-i)*2;
	            int start=0;
	            for(int j=1;j<=num*2;j++){
	                if(j>i && start <spacecount){
	                    System.out.print(" ");
	                    start++;
	                }else{
	                    System.out.print("*");
	                }                
	            }
	            System.out.println();
	        }

                                    
        
    }

}
