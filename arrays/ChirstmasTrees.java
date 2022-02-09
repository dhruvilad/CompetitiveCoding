package com.arrays;

public class ChirstmasTrees {

	
	public static void main(String[] args) {
		
		int A[]= {1, 3, 5};
		int B[]= {1, 2, 3};
		//A : [ 1, 3, 5 ]
		//B : [ 1, 2, 3 ]
		
		System.out.println(solve(A,B));
		
	}
	
	 public static int solve(int[] A, int[] B) {

		  int minsum=Integer.MAX_VALUE;
	        for(int i=1;i<A.length-1;i++){
	           int sum=0;   
	            int leftB=Integer.MAX_VALUE;
	            int rightB=Integer.MAX_VALUE;
	           for(int j=i-1;j>=0;j--){
	               if(A[j] <A[i]){
	                   leftB= B[j] <leftB ? B[j] : leftB;
	               }

	           } 
	           for(int j=i+1;j<A.length;j++){
	               if(A[j] >A[i]){
	                   rightB= B[j] < rightB ? B[j] : rightB;
	               }

	           }
             if(leftB != Integer.MAX_VALUE && rightB != Integer.MAX_VALUE){
                  sum=leftB + B[i] + rightB;
                  minsum= minsum > sum  ? sum : minsum;
             }
	            
	        }

      return minsum != Integer.MAX_VALUE ? minsum : -1 ;

	    }
}
