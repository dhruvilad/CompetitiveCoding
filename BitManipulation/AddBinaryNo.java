package com.BitManipulation;

public class AddBinaryNo {
	
	
	public static void main(String[] args) {
		
		String A="1010110111001101101000";
		String B ="1000011011000000111100110";
		System.out.println(B.charAt(23) - '0');
		System.out.println(addBinary(A,B));
	}

	public static String addBinary(String A, String B) {

        int sum[]=new int[100];
        int count=0;
        int Alen = A.length()-1;
        int Blen = B.length()-1;
        int d=0;
        int c=0;
        int add=1;

        while(Alen >=0 || Blen >= 0 || c != 0){
          int valA= Alen < A.length() && Alen >= 0 ? (A.charAt(Alen) - '0') : 0;  
          int valB= Blen < B.length() && Blen >= 0 ?  (B.charAt(Blen) - '0')  : 0; 
          System.out.println(" valA :: "+valA + " valB :: "+ valB);
          add= valA+valB+c;
          d=(add) % 2;          
          c=(add) / 2;          
          sum[count] = d;
          count++;
          Alen--;
          Blen--; 
          System.out.println(" add :: "+ add + " c:: "+c +" d :: "+d);
        }

        String str="";
        for(int i=count-1;i>=0 ; i--){
            str = str +"" +sum[i];
        } 

        return str;
    }


		public static String addBinary1(String A, String B) {
			//solution by TA
		    int nA, nB;

		    char res[];

		    int i, j, k;

		    nA = A.length();

		    nB = B.length();

		    res = new char[Math.max(nA, nB) + 1];

		    k = Math.max(nA, nB);

		    i = nA - 1;

		    j = nB - 1;

		    int sum = 0, carry = 0;

		    while (i >= 0 || j >= 0 || carry != 0) {

		        sum = carry;

		        if (i >= 0)

		            sum += (A.charAt(i) - '0');

		        if (j >= 0)

		            sum += (B.charAt(j) - '0');

		        res[k] = (char) ((sum % 2) + '0');

		        carry = sum / 2;

		        i--;

		        j--;

		        k--;

		    }

		    if (res[0] == '1')

		        return new String(res);

		    int len = Math.max(nA, nB);

		    return new String(res, 1, len);

		}
		
		/*
		 * ret = empty string
		 * 
		 * na = size of a, nb = size of b
		 * 
		 * i = na - 1, j = nb - 1
		 * 
		 * carry = 0
		 * 
		 * while (i >= 0 or j >= 0), do
		 * 
		 * addA = (if i >= 0, then a[i] - ASCII of '0', otherwise 0)
		 * 
		 * addB = (if j >= 0, then b[j] - ASCII of '0', otherwise 0)
		 * 
		 * sum = addA + addB + carry
		 * 
		 * carry= sum / 2
		 * 
		 * sum = sum mod 2
		 * 
		 * ret = ret concatenate sum
		 * 
		 * (decrease i by 1)
		 * 
		 * (decrease j by 1)
		 * 
		 * if carry is non-zero, then:
		 * 
		 * ret = ret concatenate carry
		 * 
		 * reverse the array ret
		 * 
		 * return ret
		 */

	
}
