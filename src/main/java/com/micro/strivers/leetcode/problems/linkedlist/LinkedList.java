package com.micro.strivers.leetcode.problems.linkedlist;


public class LinkedList {


        Node head;

        static class Node{
            int no;
            Node next;
            public Node(int no) {
                this.no = no;
                this.next = null;
            }
        }
        public static LinkedList insert(LinkedList list, int data){
            Node newNode = new Node(data);
            newNode.next = null;
            if(list.head == null){
                list.head = newNode;
            }else{
                Node last = list.head;
                while(last.next != null){
                    last = last.next;
                }
                last.next = newNode;
            }
            return list;
        }
        public static void printList(LinkedList list){
            Node node = list.head;
            while (node.next != null){
                System.out.println(node.no);
                node = node.next;
            }
        }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insert(list, 1);
        list.insert(list, 2);
        list.insert(list, 3);
        printList(list);

    }

}
