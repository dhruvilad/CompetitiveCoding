package com.arrays;

import java.util.ArrayList;

public class ArraySequenceCheck {
	
	
	public static void main(String[] args) {
		
		int arr[]= {9,8,11 ,12 ,13,11};
		
		int min=Integer.MAX_VALUE;
		int n =arr.length;
		ArrayList<Integer> list = new ArrayList<Integer>();
		String result="YES";
		
		for(int i=0; i<n; i++) {
			min= min> arr[i] ? arr[i] : min;
			list.add(arr[i]);
		}
		System.out.println(list);
		System.out.println(min);
		for(int i=0; i<n; i++) {			
			if(!list.contains(min+i)) {
				result= "NO";
				break;
			}
		}

		System.out.println(result);
		
	}

}
