/*Problem Description
Given an array of integers A.
A subarray of an array is said to be good if it fulfils any one of the criteria:
1. Length of the subarray must be even and the sum of all the elements of the subarray must be less than B.
2. Length of the subarray must be odd and the sum of all the elements of the subarray must be greater than B.
Your task is to find the count of good subarrays in A.
*/

package com.arrays;

public class GoodSubArrays {
	
	public static void main(String[] args) {
		
		int A[]= {13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
		int B = 65;
		
		System.out.println(solveTA(A,B));
		
	}
	
	
	public static int solveTA(int[] A, int B) {
	
		    int n=A.length;

		    int dp[]= new int[n+1];

		    dp[0]=0;

		    int ans=0;

		    for(int i=0;i<n;i++) dp[i+1]=dp[i]+A[i];

		    for(int i=0;i<n;i++){

		        for (int j=i;j<n;j++){

		            int sz=j-i+1;

		            int sum=dp[j+1]-dp[i];

		            if(sz%2==0 && sum<B)ans++;

		            if((sz & 1) == 1 && sum>B)ans++;

		        }

		    }

		    return ans;

	}
	
	
	 public static int solve(int[] A, int B) {

		 	int start =0;
	        int end=1;
	        int count=0;
	        long evensum=0;
	        long oddsum=0;

	        while(end < A.length){

	            System.out.println("before start :: "+ start + " end :: "+ end + " count :: "+ count + " evensum :: " + evensum);
	            if(A[end-1]+A[end]+evensum > B){
	                start++;
	                end=start+1;
	                evensum=0;
	            }else{
	                evensum=A[end-1]+A[end]+evensum;
	                end=end+2;
	                count++;
	            }
	            if(end >= A.length ) {
	            	start++;
	            	end=start+1;
	            	evensum=0;
	            }
	            System.out.println("after start :: "+ start + " end :: "+ end + " count :: "+ count + " evensum :: " + evensum);
	        }
	        
	        start=0;
	        end =0;
	        while(end < A.length){
	            System.out.println("before start :: "+ start + " end :: "+ end + " count :: "+ count + " oddsum :: " + oddsum);
	            if(end == start){
	            	oddsum= oddsum+A[end]; 
	            	end=end+2;
	            }else {
	            	oddsum += A[end-1]+A[end];
	            	end=end+2;
	            }
	            if(oddsum > B) {
	            	count++;
	            }            	
	            	
	            	
	            if(end >= A.length ) {
	            	start++;
	            	end=start;
	            	oddsum=0;
	            }
	            System.out.println("after start :: "+ start + " end :: "+ end + " count :: "+ count + " oddsum :: " + oddsum);
	        }
	        
	        
	        return count;
	    }

}
