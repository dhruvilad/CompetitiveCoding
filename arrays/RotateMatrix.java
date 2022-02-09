package com.arrays;

public class RotateMatrix {
	
	
	public static void main(String[] args) {
		
		 int A[][]= {{1,2},{3,4}};
		solveWithOutNewArray(A);
		
		ArrayUtil.print2DMatrix(A);
	}
	
	public static void solveWithOutNewArray(int[][] A) {

        int row=A.length;
        int col=A[0].length;
        
        for(int i=0; i<row;i++) {
        	for(int j=i+1;j<col;j++) {
        		int temp=A[j][i];
                A[j][i]=A[i][j];
                A[i][j]=temp;
        	}
        }
        

        ArrayUtil.print2DMatrix(A);
    
        for(int j=0;j<col/2;j++){
            for(int i=0;i<row;i++){
                int temp=A[i][col-1-j];
                A[i][col-1-j]=A[i][j];
                A[i][j]=temp;
            }
        }       


        //return A;
    }

	
	
	
	public static int[][] solveWithNewArray(int[][] A) {

        int row=A.length;
        int col=A[0].length;
        int tr[][]=new int[col][row];

        for(int j=0; j<col;j++){
            for(int i=0;i<row;i++){
                tr[j][i]=A[i][j];
            }
        }

        ArrayUtil.print2DMatrix(tr);
    
        for(int j=0;j<col/2;j++){
            for(int i=0;i<row;i++){
                int temp=tr[i][col-1-j];
                tr[i][col-1-j]=tr[i][j];
                tr[i][j]=temp;
            }
        }       


        return tr;
    }

}
