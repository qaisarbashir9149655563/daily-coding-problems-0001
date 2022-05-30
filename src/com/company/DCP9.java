package com.company;
import java.util.Scanner;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class DCP9 {
/**************************
 This problem was asked by Google.
 Given k sorted singly linked lists, write a function to merge all the lists into one sorted singly linked list.
 ***************************/

        public static void printList(Node node){
            System.out.println("Sorted Linked List are :  ");
            while(node != null){
                System.out.println(node.data+" ");
                node = node.next;
            }
            System.out.println();
        }

        public static Node sortedMerge(Node a,Node b){
            if(a==null)
                return b;
            if(b ==null)
                return a;
            Node result;
            if(a.data <= b.data){
                result = a;
                result.next = sortedMerge(a.next,b);

            }
            else{
                result = b;
                result.next = sortedMerge(a,b.next);
            }
            return result;
        }

        public static Node MergeLists(Node[] lists){
            if(lists == null || lists.length == 0)
                return null;
            int n = lists.length - 1;
            while(n != 0){
                int i = 0;
                int j = n;
                while(i < n){
                    lists[i] = sortedMerge(lists[i],lists[j]);
                    i++;
                    j--;
                    if(i>=j){
                        n = j;
                    }
                }
            }
            return lists[0];
        }
        public static void main(String[] args) {
            System.out.println("Enter no of linked lists : ");
            Scanner s =new Scanner(System.in);
            int n = s.nextInt();
            Node[] lists = new Node[n];
            System.out.println("Enter Elements for 1 linked list : ");
            lists[0] =new Node(s.nextInt());
            lists[0].next = new Node(s.nextInt());
            lists[0].next.next = new Node(s.nextInt());

            System.out.println("Enter Elements for 2 linked list : ");
            lists[1] = new Node(s.nextInt());
            lists[1].next = new Node(s.nextInt());
            lists[1].next.next = new Node(s.nextInt());
            lists[1].next.next.next = new Node(s.nextInt());

            System.out.println("Enter Elements for 3 linked list : ");
            lists[2] =new Node(s.nextInt());
            lists[2].next = new Node(s.nextInt());
            lists[2].next.next = new Node(s.nextInt());

            // System.out.println("Enter number of linked lists : ");
            // Scanner s =new Scanner(System.in);
            // int n = s.nextInt();
            // Node[] lists = new Node[n];
            // for(int i=0;i<n;i++){
            //     System.out.println("No: of Elements to be inserted for "+(i+1)+" linked List.");
            //     int j = s.nextInt();
            //     System.out.println("Enter Element for "+(i+1)+" linked list: ");
            //     lists[i] = new Node(s.nextInt());
            //     j--;

            //     while(j > 0){
            //         lists[i].next=new Node(s.nextInt());
            //         j--;
            //     }
            // }



            printList(MergeLists(lists));
        }
    }