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
        LinkedListBase.Node odd = list.head;
        LinkedListBase.Node even = list.head.next;
        LinkedListBase.Node evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;  // Link current odd node to next odd node
            odd = odd.next;        // Move odd pointer
            even.next = odd.next;  // Link current even node to next even node
            even = even.next;      // Move even pointer
        }

        odd.next = evenHead;  // Append even list after odd list
        return list;
    }

}
