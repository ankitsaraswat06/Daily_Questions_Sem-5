// Last updated: 02/08/2025, 18:57:52
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
    public ListNode removeElements(ListNode head, int val) {
        // recursion approach
        if(head==null) return null;
        head.next = removeElements(head.next, val);
        return (head.val==val)? head.next : head;
    }
}