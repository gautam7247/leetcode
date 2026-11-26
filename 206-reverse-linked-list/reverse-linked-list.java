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
    public ListNode reverseList(ListNode head) {
    ListNode prev=null;
    ListNode Curr=head;
    ListNode Next=null;
    while(Curr !=null){
        Next=Curr.next;
        Curr.next=prev;
        prev=Curr;
        Curr=Next;
    }
    return prev;
    }
}