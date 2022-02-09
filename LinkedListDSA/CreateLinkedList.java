package com.LinkedListDSA;

public class CreateLinkedList {
	
	public static void main(String[] args) {
		
		insert_node(1, 10);
		insert_node(2, 15);
		insert_node(3, 10);
		print_ll();
	}
	

    static class ListNode{
        int data;
        ListNode next;

        ListNode(int value){
            this.data=value;
            this.next=null;
        }
        ListNode(){
            this.data=0;
            this.next=null;
        }
    }

   static ListNode head=null;
   static int size_of_ll = 0;
    
    public static void insert_node(int position, int value) {
        // @params position, integer
        // @params value, integer

        if(position >= 1 && position <= size_of_ll+1){
            if(position == 1){
                head=new ListNode(value);
                //n1.next=null;
            }else{
                ListNode temp=head;
                int c=1;
                while( c < position-1){
                    temp=temp.next;
                    //System.out.println(temp + " "+temp.next);
                    c++;
                }
                ListNode n1=new ListNode(value);
                n1.next=temp.next;
                temp.next=n1;
            }
            size_of_ll++;
        }
    }

    public static void delete_node(int position) {
        // @params position, integer
        if(position >= 1 && position <=size_of_ll){

            ListNode temp = null;
            if (position == 1) {
                temp = head;
                head = head.next;
            } else {
                int count = 1;
                ListNode prev = head;
                while (count < position - 1) {
                    prev = prev.next;
                    count++;
                }
                temp = prev.next;
                prev.next = prev.next.next;
            }
            size_of_ll--;

            // ListNode temp=head;
            // int c=0;
            // while(c < position-1){
            //     temp=temp.next;
            //     c++;
            // }
            // temp.next=temp.next.next;
        }
    }

    public static void print_ll() {
        // Output each element followed by a space
        ListNode temp=head;
        int flag =0;
        while(temp != null){
            if(flag == 0){
                System.out.print(temp.data);
                flag=1;
            }else
                System.out.print(" "+temp.data);
            temp=temp.next;
        }
        //System.out.println();
    }


}
