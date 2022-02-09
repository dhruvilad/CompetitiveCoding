package com.BitManipulation;

public class ReverseBits {
	
	public static void main(String[] args) {
		
		
		 String str ="";
	        long div=11;
	        while(div > 0){            
	            long c =div%2;
	            div = div / 2;
	            str= str+ ""+c;
	        }
	        System.out.println(str);
	}
	
	public long reverse(long a) {

        String str ="";
        long div=a;
        while(div > 0){            
            long c =div%2;
            div = div / 2;
            str= str+ ""+c;
        }
        return 1;
	}

}
