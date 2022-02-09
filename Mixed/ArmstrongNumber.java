package com.test;

import java.util.Scanner;

public class ArmstrongNumber {
	
	 public static void main(String[] args) {
	        // YOUR CODE GOES HERE
	        // Please take input and print output to standard input/output (stdin/stdout)
	        // DO NOT USE ARGUMENTS FOR INPUTS
	        // E.g. 'Scanner' for input & 'System.out' for output
		 
		 	Scanner scan= new Scanner(System.in);
		 	
		 	long num=Long.parseLong(scan.nextLine().trim());
		 	
		 	for(long j=1; j <=num; j++) {
		 		long sum=0;
		 		String number= String.valueOf(j);
		 		//System.out.println(number);
			 	for(int i= 0; i<number.length(); i++) {
			 		int val=Integer.parseInt(String.valueOf(number.charAt(i)));
			 		
			 		sum = sum + (val *val*val);
			 		
			 		if(sum > j) {
			 			break;
			 		}
			 	}
			 	
			 	if(sum == j) {
			 		System.out.println(j);
			 	}
		 	}
		 	
		 	
		 	
	        
	    }

}
