package com.hadley;

import java.util.HashSet;
import java.util.Set;

/*
2020.08.04
141、Linked List Cycle
 */
public class _141 {

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }

    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodesSeen = new HashSet<>();
        while(head != null){
            if(nodesSeen.contains(head)){
                return true;
            }else{
                nodesSeen.add(head);
            }
            head = head.next;
        }
        return false;
}

    //two Pointers
    public boolean hasCycle1(ListNode head){
        return false;
    }
}
