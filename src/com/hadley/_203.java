package com.hadley;

/*
2020.07.20
203、Remove Linked List Elements
Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
 */

import java.util.ArrayList;
import java.util.List;

public class _203 {

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        ListNode current = head;//移动的指针
        ListNode pre = null;//用该变量记录上一个节点
        while(current.next != null){
            if (current.val == val){
                //对特殊位置，头指针进行判断
                if (current == head){
                    head = head.next;
                    current = head;
                }else{
                    //当符合条件的点在链表中间部分时
                    ListNode next = current.next;
                    pre.next = next;//将该节点删除，并将该节点的前后两个节点连接
                    current = next;
                }
            }else{
                //移动指针
                pre = current;
                current = current.next;
            }
        }
        if (current.val == val){
            //对末尾位置进行判断
            if (pre == null) return null;
            else pre.next = null;
        }
        return head;
    }

}
