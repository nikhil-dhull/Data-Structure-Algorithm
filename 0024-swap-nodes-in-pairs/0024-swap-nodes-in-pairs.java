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
    public ListNode swapPairs(ListNode head) {
        // if(head==null || head.next==null) return head;
        // ListNode empty=new ListNode(0);
        // empty.next=head;
        // ListNode temp=empty;
        // ListNode prev=temp;
        // while(prev.next!=null && prev.next.next!=null){
        //     ListNode a=prev.next;
        //     ListNode b=a.next;

        //     a.next=b.next;
        //     b.next=a;
        //     prev.next=b;

        //     prev=a;
        // }
        // return empty.next;

        if(head==null || head.next==null) return head;
        ListNode empty=new ListNode(0);
        empty.next=head;
        ListNode prev=empty;
        while(prev.next!=null && prev.next.next!=null){
            ListNode a=prev.next;
            ListNode b=a.next;
            
            a.next=b.next;
            b.next=a;

            prev.next=b;
            prev=a;
        }
        return empty.next;
    }
}