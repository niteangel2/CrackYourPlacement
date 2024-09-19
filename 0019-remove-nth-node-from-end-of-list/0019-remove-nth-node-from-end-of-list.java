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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) return null;
        int cnt = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            cnt++;
        }
        if(cnt == n) return head.next;
        cnt = cnt - n;
        temp = head;
        int i = 1;
        while(i < cnt) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }
}