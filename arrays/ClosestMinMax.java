package com.arrays;

public class ClosestMinMax {

	
	public static void main(String[] args) {
		System.out.println(solve(new int [] {814, 761, 697, 483, 981}));
		
		System.out.println(0%2);
	}
	
	public static int solve(int[] A) {

        int min=A[0];
        int max=A[0];
        int lastmin=-1;
        int lastmax=-1;
        int len=0;

        for(int i=1;i<A.length; i++){
            if(A[i] > max){
                max=A[i];
            }
            if(A[i] <min){
                min=A[i];
            }
        }

        for(int i=0;i<A.length;i++){
            int templen=0;
            if(A[i] == min){
                lastmin=i;
            }
            if(A[i] ==  max){
                lastmax=i;
            }

            if(lastmin != -1 && lastmax != -1){
              templen= Math.abs(lastmax-lastmin)+1;
              System.out.println(templen + "   "+  len);
              if(len == 0 || templen<len)
                len=templen;   
            }
        }
        return len;

    }
}
