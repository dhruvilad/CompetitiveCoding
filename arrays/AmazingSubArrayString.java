package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class AmazingSubArrayString {
	
	public static void main(String[] args) {
		System.out.println(solve("ABCEC"));
	}
	
	public static int solve(String A) {

        int size=0;    
        

        ArrayList<Character> list=new ArrayList<>(Arrays.asList( new Character[] {'a','e','i','o','u','A','E','I','O','U'}));
        
        for(int i=0; i<A.length(); i++){
            if(list.contains(A.charAt(i))) {
            	System.out.println(" i "+ A.charAt(i) );
            	int sum= A.length()-i;
            	size =size + sum;
            }
        }
        
        size = size % 10003;
        
        return size;
    }

}
