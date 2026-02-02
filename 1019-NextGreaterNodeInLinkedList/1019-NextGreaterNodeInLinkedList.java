// Last updated: 02/02/2026, 15:34:13
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
12    int size = 0;
13    public ListNode reverse(ListNode head) {
14        ListNode prev = null;
15        ListNode curr = head;
16        while(curr!=null) {
17            ListNode next = curr.next;
18            curr.next = prev;
19            prev = curr;
20            curr = next;
21            size++;
22        }
23        return prev;
24    }
25    public int[] nextLargerNodes(ListNode head) {
26        ListNode newHead = reverse(head);
27        ListNode temp = newHead;
28        int[] ans = new int[size];
29        int idx = size-1;
30        Stack<Integer> st = new Stack<>();
31        while(temp!=null) {
32            while(!st.isEmpty() && temp.val>=st.peek()) {
33                st.pop();
34            }
35            ans[idx--] = st.isEmpty()?0:st.peek();
36            st.push(temp.val);
37            temp = temp.next;
38        }
39        return ans;
40        
41    }
42}