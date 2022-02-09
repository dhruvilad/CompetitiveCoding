package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NobleInteger {
	
	public static void main(String[] args) {
		
		Integer arr[]= {-2, 8, 8, 6, -2, 3, -2, -7, 3, 3, -2, 0, 4, -3, -4, -2, -1, -10, -4, -2, 7, -1, 0, -7, 3, -7, 7, 3, 2, -4, -5, 2, 6, 5, -2, 7, -1, 6,
				-10, 4, -9, -10, -6, -2, -3, 0, -2, 6, -8, 4, 7, 9, -7, 9, -8, -2, -7, -10, -9, -3, 8, 9, 1, 5, 4, 9, 2, 5, -3, -6, -1, -1, -6 };
		//List list=Arrays.asList(arr);
		List<Integer> alist=new ArrayList<Integer>();
		Collections.addAll(alist,arr);
		System.out.println(solve((ArrayList<Integer>) alist));
	}
	
	 public static int solve(ArrayList<Integer> A) {

	        Collections.sort(A, Collections.reverseOrder());
	        System.out.println(A);
	        int ans=0;
	        int less =0;

	        if(A.get(0) == 0){
	            ans++;
	        }
	        
	        for(int i=1;i< A.size();i++){	  
	        	less=0;
	            if ( A.get(i) != 0 && A.get(i) != A.get(i-1)){
	                less=i;
	            }	            
	            if( A.get(i) != 0 && less == A.get(i)){
	                ans++;
	            }
	            System.out.println("A.get(i) :: "+ A.get(i) + " A.get(i-1) :: "+ A.get(i-1) + " less :: "+less + " ans :: "+ ans);
	        }
	        return ans == 0 ? -1 : ans ;
	    }

}
