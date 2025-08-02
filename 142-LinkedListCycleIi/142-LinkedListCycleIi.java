// Last updated: 02/08/2025, 18:58:17
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode startingPoint(ListNode fast, ListNode head) {
        ListNode temp = head;
        while(temp!=fast) {
            fast = fast.next;
            temp = temp.next;
        }
        return temp;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) {
                return startingPoint(fast, head);
            }
        }
        return null;
    }
}