package com.hadley;

/*
2020.01.12
Copy List with Random Pointer

 */

import java.util.HashMap;

public class _138 {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if(head == null) return null;

        HashMap<Node, Node> map = new HashMap<>();
        Node newHead = new Node(head.val);
        map.put(head,newHead);

        Node oldP = head.next;
        Node newP = newHead;
        while(oldP != null){
            Node newNode = new Node(oldP.val);
            map.put(oldP,newNode);
            newP.next = newNode;

            oldP = oldP.next;
            newP = newP.next;

        }

        oldP = head;
        newP = newHead;

        while(oldP != null){
            newP.random = map.get(oldP.random);
            oldP = oldP.next;
            newP = newP.next;

        }

        return newHead;
    }
}
