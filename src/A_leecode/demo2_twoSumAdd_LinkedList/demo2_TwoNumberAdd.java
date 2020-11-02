package A_leecode.demo2_twoSumAdd_LinkedList;

import java.math.BigInteger;

public class demo2_TwoNumberAdd {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(1,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9,
                                                                new ListNode(9,
                                                                        new ListNode(9,
                                                                                new ListNode(9))))))))));
        new Solution().addTwoNumbers(l1,l2);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder number1=new StringBuilder("");
        StringBuilder number2=new StringBuilder("");;

        while (l1!=null){
            number1=number1.insert(0,l1.val);
            l1=l1.next;
        }

        while (l2!=null){
            number2=number2.insert(0,l2.val);
            l2=l2.next;
        }
        System.out.println("l1="+number1+"   l2="+number2);

        BigInteger b1=new BigInteger(number1.toString());
        BigInteger b2=new BigInteger(number2.toString());
        BigInteger sum=b1.add(b2);
        System.out.println("sum="+sum);
        ListNode SumNode = null;
        ListNode ReturnNode = null;
        char[] chars = String.valueOf(sum).toCharArray();
        for (int i = chars.length-1; i >=0; i--) {
            if(i==chars.length-1){
                SumNode=new ListNode(Integer.parseInt(chars[i]+""));
                ReturnNode=SumNode;
            }
            else {
                SumNode.next=new ListNode(Integer.parseInt(chars[i]+""));
                SumNode=SumNode.next;
            }
        }
        return ReturnNode;

    }
}
class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }
}

