package com.micro.strivers.leetcode.problems.linkedlist;

public class RemoveDuplicate {
    Node head;
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
    public static LinkedListBase insert(LinkedListBase list, int no){
        // create a new node with provided no
        LinkedListBase.Node newNode = new LinkedListBase.Node(no);
        newNode.next = null;

        // check wheather head is null or not.
        if(list.head != null){
            list.head = newNode;
        }else{
            LinkedListBase.Node travel = list.head;
            // if not traverse to end of the node and then add
            while(travel.next != null){
                travel = travel.next;
            }
            travel.next = newNode;
        }
        return list;
    }
    static Node removeDuplicate(Node node){
        // check node is null or not
        if(node.next == null){
            return node;
        }
        // traverse whole node their check wheather any no having duplicate remove

        while(node.next != null){
            if(node.next.val == node.val){
                node.next = node.next.next;
            }else {
                node = node.next;
            }
        }
        return node;


    }
}
