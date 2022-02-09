package com.arrays;

import java.util.Arrays;

public class LeftRotations {
	
	public static void main(String[] args) {
		solve(new int[] {6, 31, 33, 13, 82, 66, 9, 12, 69, 21, 17, 2, 50, 69, 90, 71, 31, 1, 13, 70, 94, 46, 89, 13, 55, 54, 67, 97, 28, 27, 62, 34, 41, 18, 
							15, 35, 13, 84, 93, 27, 89, 23, 6, 56, 94, 40, 54, 95, 47},
				new int[] {88, 85, 98, 36, 66, 40, 30, 26, 51, 77, 62, 60, 92, 64, 53, 86, 24, 53, 85, 49, 57, 29, 32, 60, 75, 82, 17, 23, 67, 51, 23, 11, 70, 59});
	}

	public static int[][] solve(int[] A, int[] B) {

		int arr[]=Arrays.copyOf(A, A.length);
		int ans[][]=new int[B.length][A.length];
		for(int i=0; i<arr.length/2; i++){
            
            arr[i]=arr[i]+arr[arr.length-i-1];
            
            arr[arr.length-i-1]=arr[i]-arr[arr.length-i-1];
            
            arr[i]=arr[i]-arr[arr.length-i-1];
        }
		
		for(int j=0; j<arr.length;j++)
    		System.out.print(arr[j]+ " ");
		System.out.println( );
      
		for(int j=0;j<B.length;j++) {
			 int temp=B[j];
	            
            if(temp > arr.length) {
                temp= temp % arr.length;
            }
            System.out.println( "B[j] ::: "+B[j] + " temp :::: "+temp);
    		
			int arr1[]=Arrays.copyOf(arr, arr.length);
			for(int k=0; k<arr1.length;k++)
        		System.out.print(arr1[k]+ " ");
			System.out.println(" " );
    		
	        if(temp != A.length){           
	           
	            
	            if(temp != arr1.length) {
	            	int start=0;
	            	int end=(arr.length-temp-1);
	            	System.out.println("start :: "+start + " end :: "+end);
	        		while(start<end) {
	        			arr1[start]=arr1[start]+arr1[end];
	                    
	                    arr1[end]=arr1[start]-arr1[end];
	                    
	                    arr1[start]=arr1[start]-arr1[end];
	                    start++;
	                    end--;
	        		}
	        		
	        		start=arr.length-temp;
	        		end=arr.length-1;
	        		System.out.println("start :: "+start + " end :: "+end);
	        		while(start<end) {
	        			arr1[start]=arr1[start]+arr1[end];
	                    
	                    arr1[end]=arr1[start]-arr1[end];
	                    
	                    arr1[start]=arr1[start]-arr1[end];
	                    start++;
	                    end--;
	        		}
	        		for(int k=0; k<arr1.length;k++)
	            		System.out.print(arr1[k]+ " ");
	        		System.out.println( );
	        		
	                
					/*
					 * for(int i=arr.length-temp ;i>(arr.length-temp-1)/2; i--) {
					 * arr1[i]=arr1[i]+arr1[arr.length-i-1+temp];
					 * arr1[arr.length-i-1+temp]=arr1[i]-arr1[arr.length-i-1+temp];
					 * 
					 * arr1[i]=arr1[i]-arr1[arr.length-i-1+temp]; }
					 */
	                ans[j]=arr1;
	            }
	        }else {
	        	ans[j]=A;
	        }
		}    
        for(int i=0; i<ans.length; i++){
        	System.out.print( "[ ");
        	for(int j=0; j<arr.length;j++)
        		System.out.print(ans[i][j]+ " ");
        	
        	System.out.println(" ]" );
        }
        return ans;
    }
}
