package com.StringCode;

public class ReverseString {
	
	public static void main(String[] args) {
		String str="crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv ";
		
		System.out.println(solve(str));
	}
	
	 public static String solve(String A) {
	        A=A.trim();
	        char arr[]=A.toCharArray();

	         for(int i=0; i<arr.length/2 ; i++ ){
	            char temp=arr[i];
	           arr[i]=arr[A.length()-1-i];
	            arr[A.length()-1-i]= temp;
	        }
	         
	         System.out.println(String.valueOf(arr));


	        int prevLen=0;
	        for(int i=0; i<arr.length;i++){
	            if(arr[i] == ' ' || i == arr.length-1){
	            	i = i==arr.length-1 ? ++i : i;
	            	
	            	int count = (i-prevLen)/2;
	            	int s=prevLen;
	            	int e=i-1;
	            	System.out.println("i ::"+i + " prevLen :: "+prevLen + " s:: "+s + " e :: "+e + " count :: "+ count);
	            	while(count >0 && s >= 0 && e>=0 ) {
	                //for(int j=prevLen; j<i/2;j++){
	                    char temp=arr[s];
	                    char temp1=arr[e];
	                    arr[s]=temp1;
	                    arr[e]= temp;
	                    System.out.println("s :: "+ s + " e :: "+e + " arr[s]"+arr[s]+ " arr[e]"+arr[e]);
	                    s++;
	                    e--;
	                    count--;
	                }
	                prevLen=i+1;
	            }
	        }

	        A=String.valueOf(arr);
	        
	        // for(int i=0; i<A.length()/2 ; i++ ){
	        //     char temp=A.charAt(i);
	        //     A.charAt(i)=A.charAt(A.length()-1-i);
	        //     A=A.subString(0,)
	        //     A.charAt(A.length()-1-i)= temp;
	        // }


	        // int prevLen=0;
	        // for(int i=0; i<A.length;i++){
	        //     if(A.charAt(i) == ' '){
	        //         for(int j=prevLen; j<i/2;j++){
	        //             char temp=A.charAt(j);
	        //             A.charAt(j)=A.charAt(i-1-j);
	        //             A.charAt(i-1-j)= temp;
	        //         }
	        //         prevLen=i+1;
	        //     }
	        // }

	        return A;
	    }

}
