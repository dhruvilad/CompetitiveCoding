package com.arrays;

import java.util.Scanner;

public class EvenSumOddSum {
	
	public static void main(String[] args) {
		
		
		Scanner scan =new Scanner(System.in);
		
		int sizeA =scan.nextInt();
		int A[] = new int[sizeA];
		
		 for(int i=0; i<A.length;i++){
	           A[i]=scan.nextInt();
	     }
		 
		 int Q1=scan.nextInt();
		 int Q2=scan.nextInt();
		
        int psEven[]=new int[A.length];
        int psOdd[]=new int[A.length];
        psEven[0]=A[0];
        psOdd[0]=0;
        int val =-1;
        
        for(int i=1; i<A.length;i++){
            if(i % 2 ==0) {
            	psEven[i]=psEven[i-1]+A[i];
            	psOdd[i]=psOdd[i-1];
            }else {
            	psEven[i]=psEven[i-1];
            	psOdd[i]=psOdd[i-1]+A[i];
            }
        }
         //boolean even=false;
        if((Q2-Q1) % 2==0) {
        	val=psEven[Q2] - psEven[Q1-1];
        }else {
        	val=psOdd[Q2] - psOdd[Q1-1];
        }
        System.out.println(val);
        
        //return val;

		
		
	}

}
