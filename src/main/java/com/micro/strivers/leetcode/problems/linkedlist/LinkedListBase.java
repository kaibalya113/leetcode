package com.micro.strivers.leetcode.problems.linkedlist;

public class LinkedListBase {
    Node head;

    static class Node{
        int no;
        Node next;

        Node(int no){
            this.no = no;
        }
        Node(int no, Node next){
            this.no = no;
            this.next = next;
        }
    }
    public static LinkedListBase insert(LinkedListBase list, int no){
        // create a new node with provided no
        Node newNode = new Node(no);
        newNode.next = null;

        // check wheather head is null or not.
        if(list.head == null){
            list.head = newNode;
        }else{
            Node travel = list.head;
            // if not traverse to end of the node and then add
            while(travel.next != null){
                travel = travel.next;
            }
            travel.next = newNode;
        }
        return list;
    }
    public static void printList(LinkedListBase list){
        Node node = list.head;
        while (node.next != null){
            System.out.println(node.no);
            node = node.next;
        }
        System.out.println(node.no);
    }
}
