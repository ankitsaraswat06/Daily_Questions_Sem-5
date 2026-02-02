// Last updated: 02/02/2026, 15:08:54
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
23    public ListNode doubleIt(ListNode head) {
24       int carry = 0;
25       ListNode curr = reverse(head);
26       ListNode temp = curr;
27       while(temp!=null) {
28        int val = (temp.val * 2 + carry);
29        int rem = val % 10;
30        carry = val / 10;
31        temp.val = rem;
32        temp = temp.next;
33       }
34       ListNode ans = reverse(curr);
35       if(carry!=0) {
36        ListNode nn = new ListNode(carry);
37        nn.next = ans;
38        ans = nn;
39       }
40        
41        return ans;
42    }
43}