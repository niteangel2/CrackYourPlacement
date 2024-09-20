/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        int sum = 0;
        int carry = 0;
        ListNode res = new ListNode(-1);
        ListNode temp = res;
        while(t1 != null && t2 != null) {
            sum = t1.val + t2.val + carry;
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            temp.next = newNode;
            temp = temp.next;
            t1 = t1.next;
            t2 = t2.next;
        }
        while(t1 != null) {
            sum = t1.val + carry;
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            temp.next = newNode;
            temp = temp.next;
            t1 = t1.next;
        }
        while(t2 != null) {
            sum = t2.val + carry;
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            temp.next = newNode;
            temp = temp.next;
            t2 = t2.next;
        }

        if(carry != 0) {
            ListNode newNode = new ListNode(carry);
            temp.next = newNode;
            temp = temp.next;
        }
        return res.next;
    }
}