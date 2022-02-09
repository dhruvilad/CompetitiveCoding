package com.arrays;

public class SpecialIndex {
	
	public static void main(String[] args) {
		System.out.print(solve1(new int[]{1, 2, 3, 7, 1, 2, 3}));
	}
	
	
	//Count ways to make sum of odd and even indexed elements equal by removing an array element
	//Problem Description: Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
	public static int solve1(int[] A) {

		int psEven[]=new int[A.length];
        int psOdd[]=new int[A.length];
        psEven[0]=A[0];
        psOdd[0]=0;
        int val =0;
        int oddsum=0;
        int evensum=0;
        
        for(int i=1; i<A.length;i++){
            if(i % 2 ==0) {
            	psEven[i]=psEven[i-1]+A[i];
            	psOdd[i]=psOdd[i-1];
            }else {
            	psEven[i]=psEven[i-1];
            	psOdd[i]=psOdd[i-1]+A[i];
            }
        }
        
        for(int i=0; i<A.length;i++){
        	if(i == 0) {
        		evensum=(psEven[A.length-1]-psEven[i]);
 	           	oddsum=(psOdd[A.length-1]-psOdd[i]);
        	}else {
	           evensum=psEven[i-1]+(psOdd[A.length-1]-psOdd[i]);
	           oddsum=psOdd[i-1]+(psEven[A.length-1]-psEven[i]);
        	}
           if(evensum == oddsum) {
        	   val++;
           }
        }
        
        return val;
    }
	
	
	/// to find whether the index is special index as in if by remove that index its left sum and right sum are same
	public static int solve(int[] A) {

        int val =-1;
        int ps[]=new int[A.length];
        ps[0]=A[0];

        for(int i=1; i<A.length;i++){        	
            ps[i]=ps[i-1]+A[i];
        }

        for(int i=0;i<A.length;i++){
            if(i==0 && (ps[A.length-1]-ps[i]) == 0){
                val =0;
            }else if(i != 0 && ps[i-1] == (ps[A.length-1]-ps[i]) ){
                val=i;
            }
        }
        return val;



    }

}
