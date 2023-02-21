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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode it = head;
        while(it !=null){
            if(it.next == null){
            break;
        }
            if(it.val == it.next.val){
                it.next = it.next.next;                
        }
        else{
            it = it.next;
        }
    }
        return head;
    }
}
