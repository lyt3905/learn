package A_leecode.demo206_reverseList;



public class reverseList {

}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre=head;
        ListNode cur=null;
        while(pre!=null){
            ListNode temp=pre.next;
            pre.next=cur;
            cur=pre;
            pre=temp;
        }
        return  cur;
    }
}
