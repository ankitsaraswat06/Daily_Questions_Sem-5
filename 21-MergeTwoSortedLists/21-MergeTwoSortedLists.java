// Last updated: 02/02/2026, 14:16:53
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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode t1 =list1;
14        ListNode t2 = list2;
15        ListNode dummy = new ListNode();
16        ListNode curr = dummy;
17        while(t1!=null && t2!=null) {
18            if(t1.val<t2.val) {
19                curr.next = t1;
20                t1 = t1.next;
21            } else {
22                curr.next = t2;
23                t2 = t2.next;
24            }
25            curr = curr.next;
26        }
27        while(t1!=null) {
28            curr.next = t1;
29            t1 = t1.next;
30            curr = curr.next;
31        }
32        while(t2!=null) {
33            curr.next = t2;
34            t2 = t2.next;
35            curr = curr.next;
36        }
37        return dummy.next;
38        
39    }
40}