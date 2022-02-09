package com.arrays;

public class LongestConsecutiveOnes {
	
	public static void main(String[] args) {
		
		System.out.println(solve("010100110101"));
	}
	
	public static int solve(String A) {
        int len=0;
        int maxlen=0;
        int count=0;
        for(int i=0; i<A.length();i++){
             if(A.charAt(i) == '1')
	               count++;

        }

        System.out.println("count :: "+ count);
        
        for(int i=0; i< A.length();i++){
            if(A.charAt(i) == '0'){
                int left=0;
                int right=0;
                for(int j=i-1;j>=0; j--){
                	System.out.println(" j :: "+ j);
                    if(A.charAt(j) == '1' ) 
                        left++;
                    else
                        break;
                }

                for(int k=i+1; k<A.length(); k++){
                	System.out.println(" k :: "+ k);
                    if(A.charAt(k) == '1' ) 
                        right++;
                    else
                        break;
                }
                len=left + right < count ? left+right +1 : left+right;
                System.out.println("i :: "+ i + " left :: "+left + " right :: "+right+ " len :: "+ len + " maxlen :: "+ maxlen);
                maxlen = Math.max(len,maxlen);
            }
        }

        return maxlen;
    }

}
