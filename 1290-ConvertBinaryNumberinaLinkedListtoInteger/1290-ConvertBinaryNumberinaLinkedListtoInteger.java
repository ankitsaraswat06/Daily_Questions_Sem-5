// Last updated: 03/12/2025, 11:26:04
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
12    public int getDecimalValue(ListNode head) {
13        ListNode temp = head;
14        List<Integer> ll =new ArrayList<>();
15        while(temp!=null) {
16            ll.add(temp.val);
17            temp = temp.next;
18        }
19        int mul = 1;
20        int num = 0;
21        for(int i=ll.size()-1; i>=0; i--) {
22            num = num + ll.get(i) * mul;
23            mul = mul * 2;
24        }
25        return num;
26        
27    }
28}