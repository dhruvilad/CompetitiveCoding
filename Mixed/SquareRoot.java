package com.test;

import java.util.Scanner;

public class SquareRoot {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int num=Integer.parseInt(scan.nextLine().trim());
		
		System.out.print(calSquareRoot(num));
		
		num=Integer.parseInt(scan.nextLine().trim());
		
		System.out.print(calSquareRoot(num));
		
		num=Integer.parseInt(scan.nextLine().trim());
		
		System.out.print(calSquareRoot(num));

		
		num=Integer.parseInt(scan.nextLine().trim());
		
		System.out.print(calSquareRoot(num));

		
		
		
	}
	
	public static int calSquareRoot(int A) { //842ms
		
		int res =-1;
		
		for(int i =1; i<= A/i; i++) {
			
			if(i*i == A) {
				res=i;
			}
			
		}
		
		return res;
		
	}
	
	public static int leetCodeSol(int x) {
		if(x == 0) return 0;
        
        int l = 1, r = x, res = 1;
        
        while(l <= r) {
            int mid = l + (r-l) / 2;
            if(mid <= x/mid) {
                res = mid;
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
        return res;
	}
	
	public static int newSolve(int A) {
		int val =-1;
		int mid=0;
        int num=A;
        int min=1;
        while(min <num) {
        	if(min*min ==A) {
        		val=min;
        	}else {    
        		mid =num/2;
        		if( mid * mid  > A) {
	        		num=mid;
	        		min++;
	        	}else if( mid * mid  < A) {
	        		min=mid;
	        	}        		
        	}
        }
		
		return val;
	}
	
		 public static int solve(int A) {
	        int val=-1;
	        int mid=0;
	        int num=A;
	        for(int i =1; i<num; i++){
	        	if(i*i == A) {
	        		val=i;
	        	}else if( mid < num) {
		        	mid= num/2; 
		        	if(mid*mid == A) {
		        		val=mid;
		        	}else if( mid * mid  > A) {
		        		num=mid;
		        	}else if( mid * mid  < A) {
		        		i=mid;
		        	}
	        	}
	        	
	        }
	        return val;
	  }

}
