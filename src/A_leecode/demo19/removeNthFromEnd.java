package A_leecode.demo19;

import java.util.Stack;

public class removeNthFromEnd {
    public static void main(String[] args) {
        ListNode[] a = new ListNode[10];

     for(int i=0;i<10;i++){
            a[i]=new ListNode(i);
        }
        for(int i=0;i<9;i++){
                a[i].next=a[i+1];
        }
/*    a[0]=new ListNode(1);
    a[1]=new ListNode(2);
    a[0].next=a[1];*/
        ListNode head = a[0];

        while (head!=null){
            System.out.println(head.val);
            head=head.next;
        }
        head = a[0];
        ListNode listNode = new Solution().removeNthFromEnd(head, 2);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
//����ָ��
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode first=new ListNode(-1);
        ListNode p1=first;
        ListNode p2=first;
        first.next=head;
        while (n>0){
            p2=p2.next;
            n--;
        }
        while (p2.next!=null){
            p2=p2.next;
            p1=p1.next;
        }
        p1.next=p1.next.next;
        return first.next;
    }
}
//ʹ��ջ�������еĵĽڵ�ѹ��ջ�У�Ȼ����������n �����������Ĵ�����ͬʱ����һ��ͷ�������������ڵ�Ϊ�յ������
/*class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Stack<ListNode> s=new Stack<>();
        ListNode zero=new ListNode(-1);
        s.push(zero);
        zero.next=head;
        while (head!=null){
            s.push(head);
            head= head.next;
        }

        while (n>0){
            s.pop();
            n--;
        }
        ListNode pre = s.pop();
        pre.next=pre.next.next;
        return zero.next;
    }
}*/







//���α�����ʹ��һ��i��־���������ĳ���
/*
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i=0;
        ListNode res=new ListNode(-1);
                res.next= head;
        while (head!=null){
            i++;
            head=head.next;
        }
        if(i==1&& n ==1) return null;
        head=res;
        i=i-n;
        if(i>=1)
        while (i>0){
            head=head.next;
            i--;
        }
        else{
            head.next=head.next.next;
            return res.next;
        }
        head.next=head.next.next;

        return res.next;
    }
}*/
