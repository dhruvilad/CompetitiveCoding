package com.arrays;

public class EquilibriumIndex {
	
	public static void main(String[] args) {
		System.out.print(solve(new int[]{1,2,3,7,1,2,3}));
	}
	
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
