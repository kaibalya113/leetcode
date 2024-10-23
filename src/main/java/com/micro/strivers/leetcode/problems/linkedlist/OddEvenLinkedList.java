package com.micro.strivers.leetcode.problems.linkedlist;

public class OddEvenLinkedList {
    public static void main(String[] args){
        LinkedListBase list = new LinkedListBase();
        list.insert(list, 1);
        list.insert(list, 2);
        list.insert(list, 3);
        list.insert(list, 4);
        list.insert(list, 5);
        LinkedListBase.printList(list);

        // add odd and even value together
        addEvenLL(list);

    }

    private static LinkedListBase addEvenLL(LinkedListBase list) {
        if(list == null || list.head == null){
            return list;
        }
        LinkedListBase.Node node = list.head;
        while(node.next != null){
            if(node.no % 2 == 0){

            }
            node = node.next;
        }
        return null;
    }

}
