package com.arrays;

public class MaxSubArraySumEasy {
	
	public static void main(String[] args) {
		System.out.println(maxSubarray(9,14, new int[] {1, 2, 4, 4, 5, 5, 5, 7, 5} ));
		
		String str="ab";
		System.out.println();
	}
	
	public static int maxSubarray(int A, int B, int[] C) {


	    //     int maxsum=Integer.MIN_VALUE;
	    //    int sum=0;       

	    //     for( int i=0;i<A;i++){
	    //         sum=sum+C[i];
	    //        if(sum <0){
	    //            sum=0;
	    //        }else if(sum > B)
	    //             sum=C[i];
	                
	    //         if(sum > maxsum && sum <=B){
	    //             maxsum=sum;
	                
	    //         }
	    //         if(i+1 <A && sum+C[i+1] > B)
	    //             sum=C[i];
	            
	    //     }
	    //     if(maxsum == Integer.MIN_VALUE || maxsum > B)
	    //         maxsum=0;
	    //     return maxsum;

	        int start=0, end=0;
	        int sum=0,ans=0;

	        while(end<A)
	        {
	            if(sum + C[end] > B) {
	                sum = sum - C[start];
	                start++;
	            } else {
	                sum = sum + C[end];
	                ans = Math.max(ans, sum);
	                end++;
	            }
	        }
	        return ans;
    }


}
