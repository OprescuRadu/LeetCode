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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode it = head;
        ListNode newIt = head;
        int listLength = 1;
        if(head == null){
            return head;
        }
        while(it.next != null){
            listLength++;
            it = it.next;
        }
        for(int i = 0; i < listLength - k % listLength -1; i++){
            newIt = newIt.next;
        }
        it.next = head;
        head = newIt.next;
        newIt.next = null;
        return head;
    }
}