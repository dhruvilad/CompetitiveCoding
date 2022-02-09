package com.hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Diff2 {
	
	public static void main(String[] args) {
		
		int arr[]= { 11, 85, 100, 44, 3, 32, 96, 72, 93, 76, 67, 93, 63, 5, 10, 45, 99, 35, 13 };
		
		List<Integer> A=new ArrayList();
		for (int y : arr) {
		    A.add(y);
		}
		
		System.out.println(diffPossible(A, 60));
	}
	
	 public static int diffPossible(final List<Integer> A, int B) {

			
			/*
			 * HashMap<Integer, Integer> set = new HashMap<Integer, Integer>();
			 * 
			 * for (int i = 0; i < A.size(); i++) { if (set != null && set.containsKey(B >
			 * A.get(i) ? B - A.get(i) : A.get(i) - B) && i != set.get(B > A.get(i) ? B -
			 * A.get(i) : A.get(i) - B)) { System.out.println(A.get(i) + "  " +
			 * set.get(A.get(i)) + " " + (set.containsKey(B > A.get(i) ? B - A.get(i) :
			 * A.get(i) - B))); return 1; } else if (B == 0 && set.containsKey(A.get(i))) {
			 * return 1; } else { set.put(A.get(i), i); } }
			 */
		 
		 HashSet set=new HashSet();

	        for(int i=0;i<A.size();i++){
	        	System.out.println(set + "  " + A.get(i));
	            if(B== 0 && set.contains(A.get(i))){
	                return 1;
	            }else if(set.contains(B+A.get(i)) || set.contains(B-A.get(i))){
	                return 1;
	            }else{
	                set.add(A.get(i));
	            }

	        }
			 

	        return 0;
	    }

}
