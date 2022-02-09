package com.arrays;

public class LongestSequentialSubArray {
	
	public static void main(String[] args) {
		
		int arr[]= {1,9,3,4,5,2,6,7,8,9};
		
		int prevIndex=0;
		int prevLen=0;
		int currIndex=0;
		int currLen=0;
		
		for(int i=0;i<arr.length;i++) {
			if(prevLen == 0) {
				prevIndex=1;
				prevLen=1;
				currIndex=1;
				currLen=1;
			}
			if(currIndex+currLen == arr[i]) {
				currLen++;
				if(currLen > prevLen) {
					prevIndex=currIndex;
					prevLen=currLen;
				}
			}else {
				currIndex =arr[i];
				currLen=1;
			}			
		}
		
		int i=0;
		while(prevLen>i) {
			System.out.print((prevIndex+i) + " ");
			i++;
		}
			
	}

}
