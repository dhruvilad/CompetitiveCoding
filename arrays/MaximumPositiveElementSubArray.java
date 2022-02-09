package com.arrays;

public class MaximumPositiveElementSubArray {

	
	public static void main(String[] args) {
		int arr[]= {-4549634, -3196682, 8455838, -1432628, -263819, -3928366, -5556259, -2114783, 3923939, -4183708};
		int newArr[]=solve(arr);
		ArrayUtil.printArray(newArr);
		
	}
	
	 public static int[] solve(int[] A) {

	        int startindex=0;
	        int endindex=0;
	        int tempStart=0;
	        int tempEnd=0;
	        while(endindex <A.length){
	        	System.out.println("startindex :: "+ startindex+ " Endindex :: "+endindex);
	            if(A[endindex] >=0 && !((endindex+1) == A.length)){
	                endindex++;
	            }else if(startindex== endindex && A[endindex] <0){
	            	endindex++;
	                startindex=endindex;
	            }	            
	            else if (A[endindex] <0 ){
	                int len=endindex-startindex;
	                int templen=tempEnd-tempStart+1;
	                System.out.println(len + " "+ templen);
	                if(len > templen){
	                    tempStart=startindex;
	                    tempEnd=endindex;
	                }
	                endindex++;
	                startindex=endindex;                
	            }else if((endindex+1) == A.length){
	            	int len=endindex-startindex+1;
	                int templen=tempEnd-tempStart;
	                System.out.println(len + " "+ templen);
	                if(len > templen){
	                    tempStart=startindex;
	                    tempEnd=endindex+1;
	                }
	                endindex++;
	                startindex=endindex;   
	            }
	            System.out.println("startindex :: " + startindex + " Endindex :: "+endindex+ " tempStart :: "+tempStart +" tempEnd :: "+tempEnd);
	        }

	        int arrlen=tempEnd-tempStart;
	        int arr[]=new int[arrlen];

	        for(int i=0;i<arrlen;i++){
	            arr[i]=A[tempStart+i];
	        }
	        return arr;
	    }
}
