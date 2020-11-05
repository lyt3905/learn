package A_leecode.JianZhiOffer31_I;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {
    public static void main(String[] args) {

    }
}


class TreeNode {
    int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

class Solution {
    public int[] levelOrder(TreeNode root) {
        if(root==null) return new int[0];
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>() {
            {
                add(root);
            }
        };
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            list.add(poll.val);
            if (poll.left != null) queue.add(poll.left);
            if (poll.right != null) queue.add(poll.right);
        }
        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i]=list.get(i);
        }
        return a;
    }
}