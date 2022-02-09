package com.BitManipulation;

/*Problem Description

Arjun has a cat called Boomer. He decides to put his cat to the test for eternity.

He starts on day 1 with a stash of food unit, every next day the stash doubles.

If Boomer is well behaved during a certain day, she receives food worth equal to the stash on that day.

Boomer receives a net worth of A units of food. What is the number of days he was well behaved?*/


public class FindingGoodDays {
	
	public static void main(String[] args) {
		System.out.println(solve(5));
	}
	
	public static int solve(int A) {
        int count=0;
        while(A != 0){         
            if((( A ) & 1) == 1) {
                count++;
            }
            A=  A >> 1;
        }
        return count;
    }

}
