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
    int Gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            int gcd=Gcd(curr.val,curr.next.val);
            ListNode newN=new ListNode(gcd);
            newN.next=curr.next;
            curr.next=newN;
            curr=newN.next;
        }
        return head;
    }
}