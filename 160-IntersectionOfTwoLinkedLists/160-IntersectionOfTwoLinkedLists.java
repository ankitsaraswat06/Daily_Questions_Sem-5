// Last updated: 02/08/2025, 18:58:09
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode colPoint(ListNode t1, ListNode t2, int d) {
        while(d!=0) {
            d--;
            t2 = t2.next;
        }
        while(t1!=t2) {
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int n1 = 0, n2 = 0;
        ListNode t1 = headA;
        ListNode t2 = headB;
        while(t1!=null) {
            n1++;
            t1= t1.next;
        }
        while(t2!=null) {
            n2++;
            t2=t2.next;
        }
        if(n1<n2) {
            return colPoint(headA, headB, n2-n1);
        } else {
            return colPoint(headB, headA, n1-n2);
        }
    }
}