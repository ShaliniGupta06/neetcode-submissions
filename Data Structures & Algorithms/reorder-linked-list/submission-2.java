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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;
        slow.next = null;
        ListNode before = null;
        while(fast != null){
            ListNode after = fast.next;
            fast.next = before;
            before = fast;
            fast = after;
        }
        while(before != null){
            ListNode temp1 = head.next;
            ListNode temp2 = before.next;
            head.next = before;
            before.next = temp1;
            head = temp1;
            before = temp2;
        }

    }
}
