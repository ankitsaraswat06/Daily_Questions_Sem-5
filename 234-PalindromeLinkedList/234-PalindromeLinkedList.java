// Last updated: 02/02/2026, 14:36:44
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode reverse(ListNode head) {
13        ListNode prev = null;
14        ListNode curr = head;
15        while(curr!=null) {
16            ListNode next = curr.next;
17            curr.next = prev;
18            prev = curr;
19            curr = next;
20        }
21        return prev;
22    }
23    public boolean isPalindrome(ListNode head) {
24        ListNode slow = head;
25        ListNode fast = head;
26        while(fast.next!=null && fast.next.next!=null) {
27            slow = slow.next;
28            fast = fast.next.next;
29        }
30        ListNode newHead = reverse(slow.next);
31        ListNode first = head;
32        ListNode second = newHead;
33        while(second!=null) {
34            if(first.val!=second.val) return false;
35            first = first.next;
36            second = second.next;
37        }
38        return true;
39        
40    }
41}