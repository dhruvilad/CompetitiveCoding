package com.BitManipulation;

public class HelpFromSam {
	
	
	public static void main(String[] args) {
		System.out.println(solve(4));
	}
	
	 public static int solve(int A) {

		 int num=A;
	        int count=0;
	        while(num !=0){
	            if((num & 1) == 1)  
	                count++;      
	            num =num>>1;
	                
	        }
	        return count;

	    }

}
