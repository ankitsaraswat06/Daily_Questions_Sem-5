// Last updated: 02/08/2025, 18:58:19
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
    public boolean hasCycle(ListNode head) {
        Map<ListNode, Integer> map = new HashMap<>();
        ListNode temp = head;
        while(temp!=null) {
            if(map.containsKey(temp)) return true;
            map.put(temp, temp.val);
            temp = temp.next;
        }
        return false;
        
    }
}