// Last updated: 31/10/2025, 12:57:53
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
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;
        while(temp!=null) {
            ListNode q  = temp.next;
            temp.next = prev;
            prev = temp;
            temp = q;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = reverse(slow.next);
        ListNode first = head;
        ListNode second = newHead;

        while(second!=null) {
            if(first.val!=second.val) {
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;

    }
}