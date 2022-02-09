package com.test;

import java.util.HashSet;
import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        //Scanner val= new Scanner(System.in);

       // int count=Integer.parseInt(val.nextLine());

		/*
		 * Long num= 83l; Long val=0l; Long temp=num; for(int j=1;j<temp; j++){ if(num %
		 * j == 0) {
		 * 
		 * val= val +j; num =num/j; if(val == temp) {
		 * System.out.println("perfect number"); break; }else if (val > temp) {
		 * System.out.print("Not a perfect number"); break; } }
		 * 
		 * }
		 */
		
		Scanner val= new Scanner(System.in);

        int count=Integer.parseInt(val.nextLine());

        for(int i=0; i < count;i++){
            Long num= Long.parseLong(val.nextLine());
            Long sum=1l;
            Long temp =num;
            HashSet<Long> tempset=new HashSet<Long>();
          //  boolean status=false;
            for(int j=2;j<num; j++){
            	System.out.println(" j ::: "+j);
            	System.out.println(" sum before  ::: "+sum);
                if(num % j == 0 ) {    
                	System.out.println(" num/jj ::: "+num/j);
                    tempset.add((long) j);                                     
                    sum =sum + j;
                }               
            
            }
            System.out.println(tempset);
            // sum = sum+(Long) tempset.stream().mapToLong(Long::intValue).sum();
            System.out.println(sum);
            System.out.println(num);
            System.out.println(sum.longValue() == num.longValue() );
            
            if(sum.longValue() == num.longValue()) {           
            	System.out.println("YES");
            }else {
            	 System.out.print("NO");
            }
            

        }
        
    
        
    }
	
	/*
	 * public static Long findDiv(Long num, int div) {
	 * 
	 * if(num % div == 0) {
	 * 
	 * }else { return num; } }
	 */

   
}
