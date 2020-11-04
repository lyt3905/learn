package A_leecode.demo206_reverseList;




public class reverseList {
    public static void main(String[] args) {
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(4);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        ListNode temp=n1;
        System.out.println("反转前");
        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }

        temp=new Solution().reverseList(n1);
        System.out.println("反转后");

        while (temp!=null){
            System.out.println("temp="+temp.val);
            temp=temp.next;
        }

    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
//利用递归实现反转链表
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode ret = reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return ret;
    }

}
//利用双指针实现反转列表
/*class Solution {
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
}*/
