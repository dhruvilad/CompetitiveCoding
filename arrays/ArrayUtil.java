package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtil {
	
	public static void print2DMatrix(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j] + (arr[i][j] > 9 ? " " : "  "));
			}
			System.out.println();
		}
	}
	
	public static void printArray(int arr[]) {
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+ "  ");
		}
	}
	
	public static List addArrayToList(int arr[]) {
		List<Integer> A=new ArrayList();
		for (int y : arr) {
		    A.add(y);
		}
		return A;
	}

}
