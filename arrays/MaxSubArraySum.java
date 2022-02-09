package com.arrays;

public class MaxSubArraySum {
	
	public static void main(String[] args) {
		maxSubarray(95, 1711, 
				new int[]{68, 39, 12, 51, 52, 39, 58, 12, 74, 78, 49, 41, 25, 44, 49, 40, 41, 94, 37, 92, 15, 23, 6, 6, 85, 99, 34, 23, 94, 49, 94, 89, 65, 
						64, 53, 21, 24, 90, 22, 100, 34, 20, 73, 10, 14, 50, 75, 47, 79, 43, 93, 10, 72, 10, 20, 96, 11, 85, 47, 9, 39, 91, 68, 86, 4, 5, 72,
						59, 37, 50, 62, 37, 64, 7, 96, 72, 64, 73, 67, 51, 8, 34, 24, 5, 28, 88, 100, 52, 82, 30, 28, 61, 88, 89, 42 });
	}
	
	 public static int maxSubarray(int A, int B, int[] C) {

	        int maxsum=Integer.MIN_VALUE;
	       int sum=0;
	        

	        for( int i=0;i<A;i++){
	           sum=sum+C[i];
	           if(sum <0){
	               sum=0;
	           }else if(sum > B){
	               sum=C[i];
	           }

	           if(sum > maxsum && sum <=B){
	               maxsum=sum;	               
	           }
	           
	           if(i+1 <A && sum < B && sum+C[i+1] >B){
	               sum=C[i];
	           }
	           System.out.println(C[i] + "  " + sum + "  " +maxsum);
	        }
	        if(maxsum == Integer.MIN_VALUE)
	            maxsum=0;
	        
	        System.out.println(maxsum);
	        return maxsum;
	    }

}
