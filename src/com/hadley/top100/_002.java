package com.hadley.top100;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

date: 1st 2020.01.11
 */

public class _002 {

    //first time try
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        //result = result.next  l1 = l1.next l2 = l2.next

        int carryBit = 0; //show whether carryBit 1:yes 0:no

        while(l1 != null||l2 != null){
            int a = 0;
            if(l1!=null){
                a = l1.val;
            }
            int b = 0;
            if(l2!=null){
                b = l2.val;
            }


            if(a + b + carryBit > 9){
                carryBit = 1;
                result.val = (a + b + carryBit) % 10;
            }else{
                result.val = a + b + carryBit;
            }
            result = result.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        return result;
    }

    //after improvement
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q =l2, curr = dummyHead;
        int carry = 0;

        while(p != null || q != null){
            int a = 0;
            if(p != null){
                a = p.val;
            }
            int b = 0;
            if(q != null){
                b = q.val;
            }

            int sum = a + b + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);

            curr = curr.next;

            if(p != null){
                p = p.next;
            }
            if(q != null){
                q = q.next;
            }

        }
        if(carry > 0){
            curr.next = new ListNode(carry);
        }

        return dummyHead.next;

    }

    //definition of ListNode
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
