package com.arrays;

public class CountingSubArray {
	
	public static void main(String[] args) {
		
		//int A[]= {9, 12, 17, 9, 17, 16, 6, 4, 3, 8, 5, 13, 2, 9, 3, 13, 11};
		//int B=302;
		
		int A[]= {3, 12, 11, 11, 11, 15};
		int B=12;
		System.out.println(solve(A,B));
	}
	
	 public static int solve(int[] A, int B) {

		 int count=0;
	        int start=0;
	        int end =0;
	        int sum=0;

	        while(start < A.length){

	            System.out.println("begin start :: "+start + "  end :: "+end+ " count :: "+count + " sum :: "+ sum);
	            if(sum+A[end] >= B){
	                sum=0;
	                start++;
	                end=start;
	            }else{
	                sum=sum+A[end];
	                count++;
	                end++;

	            }
	            
	            if(end+1 > A.length){
	                start++;
	                sum=0;
	                end=start;
	            }
	            
	            System.out.println(" end  start :: "+start + "  end :: "+end+ " count :: "+count + " sum :: "+ sum);
	        }
	        return count;

	    }

}
