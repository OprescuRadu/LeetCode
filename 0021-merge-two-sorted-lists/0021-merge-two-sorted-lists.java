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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode it1 = list1;
        ListNode it2 = list2;
        ListNode list3 = new ListNode(0);
        ListNode it3 = list3;

        while(it1 != null && it2 != null){
            if(it1.val < it2.val){
                it3.next = new ListNode(it1.val);
                it1 = it1.next;
            }
            else{
                it3.next = new ListNode(it2.val);
                it2 = it2.next;
            }
            it3 = it3.next;
        }

        if(it1 == null){
            it3.next = it2;
        }
        if(it2 == null){
            it3.next = it1;
        }
        return list3.next;
    }
}