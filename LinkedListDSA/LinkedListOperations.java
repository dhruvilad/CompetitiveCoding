package com.LinkedListDSA;

import java.util.ArrayList;

import com.arrays.ArrayUtil;

public class LinkedListOperations {
	
    static ListNode head=null;
    static int size=0;
    
    public static void main(String[] args) {
    	ArrayList<ArrayList<Integer>> A=new ArrayList<ArrayList<Integer>>();
    	A.add(new ArrayList<Integer>(ArrayUtil.addArrayToList(new int[]{2, 18, 0})));
    	A.add(new ArrayList<Integer>(ArrayUtil.addArrayToList(new int[]{2, 5, 1})));
    	A.add(new ArrayList<Integer>(ArrayUtil.addArrayToList(new int[]{2, 8, 0})));
    	A.add(new ArrayList<Integer>(ArrayUtil.addArrayToList(new int[]{1, 7, -1})));  	
    	A.add(new ArrayList<Integer>(ArrayUtil.addArrayToList(new int[]{1, 5, -1})));
    	
    	solve(A);
    	
    	ListNode temp=head;
    	while(temp != null) {
    		System.out.println(temp.val);
    		temp=temp.next;
    	}
	}
    

    public static ListNode solve(ArrayList<ArrayList<Integer>> A) {

        for(int i=0;i<A.size();i++){
            if(A.get(i).get(0) == 0){
                insertAtStart(A.get(i).get(1));
            }
            if(A.get(i).get(0) == 1){
                insertAtEnd(A.get(i).get(1));
            }
            if(A.get(i).get(0) == 2){
                insertBeforeIndex(A.get(i).get(1),A.get(i).get(2));
            }
            if(A.get(i).get(0) == 3){
                deleteAtIndex(A.get(i).get(1));
            }
        }

        return head;

    }

    public static void insertAtStart(int val){
        ListNode temp=new ListNode(val);
        temp.next=head;
        head=temp;
        size++;
    }

    public static void insertAtEnd(int val){
        if(size ==0){
            insertAtStart(val);
        }else{
            ListNode temp=new ListNode(val);
            ListNode t=head;
            while(t.next != null){
                t=t.next;
            }
            temp.next= t.next;
            t.next=temp;
            size++;
        }

    }

    public static void insertBeforeIndex(int val, int index){
    	if(index==0) {
    		insertAtStart(val);
    	}
    	else if(index == size){
            insertAtEnd(val);
        }else if(index <size){
            ListNode temp=new ListNode(val);
            ListNode t=head;
            int c=0;
            while(c < index-1){
                t=t.next;
                c++;
            }
            temp.next= t.next;
            t.next=temp;
            size++;
        }
    }

    public static void deleteAtIndex(int index){
        if(index <size && size >=1){           
            if(index==0){
                head=head.next;
            }else if(index+1 == size){
                int c=0;
                ListNode temp=head;
                while(temp.next.next != null){
                    temp=temp.next;
                }
                temp.next=null;
            }
            else{
                int c=0;
                ListNode temp=head;
                while(c <index-1){
                    temp=temp.next;
                    c++;
                }
                temp.next=temp.next.next;
            }
            size--;
        }
    }

}
