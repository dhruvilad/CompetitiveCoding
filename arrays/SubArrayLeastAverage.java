package com.arrays;

public class SubArrayLeastAverage {

	public static void main(String[] args) {
		int A[] = {-584, -714, -895, -512, -718, -545, 734, -886, 701, 316, -329, 786, -737, -687, -645, 185, -947, -88, -192, 832, -55, -687, 756, -679, 558, 646,
				982, -519, -856, 196, -778, 129, -839, 535, -550, 173, -534, -956, 659, -708, -561, 253, -976, -846, 510, -255, -351, 186, -687, -526, -978, -832, 
				-982, -213, 905, 958, 391, -798, 625, -523, -586, 314, 824, 334, 874, -628, -841, 833, -930, 487, -703, 518, -823, 773, -730, 763, -332, 192, 985,
				102, -520, 213, 627, -198, -901, -473, -375, 543, 924, 23, 972, 61, -819, 3, 432, 505, 593, -275, 31, -508, -858, 222, 286, 64, 900, 187, -640, -587,
				-26, -730, 170, -765, -167, 711, 760, -104, -333 };
		int B = 32;
		System.out.println(solve(A, B));
	}

	public static int solve(int[] A, int B) {
		  int minAverage=0;
	       int index=0;
	       int sum=0;
	       int avg=0;

	        int ps[] = new int[A.length];
	        ps[0] =A[0];

	        for( int i=1;i<A.length;i++){
	           ps[i]=ps[i-1] +A[i];
	        }

	        for(int i=0;i<=A.length-B;i++){
	            if(i==0){
	                sum=ps[B-1+i];
	                minAverage=sum;
	                index=0;
	                continue;
	            }else{
	                int end=B-1+i;
	                int start=end-B;
	                sum=ps[end]- ps[start];
	            }
	            avg=sum;
	            if(minAverage > avg){
	                minAverage=avg;
	                index=i;
	            }
	            
	        }

	        return index;


	}

}
