package leetcode144;

import java.util.ArrayList;
import java.util.List;


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){

    }
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class preorderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        TreeNode left2 = new TreeNode(3);
        root.right = right;
        root.left = null;
        right.left = left2;
        right.right = null;
        List<Integer> integers = preorderTraversal(root);
        System.out.println(integers);


    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root,res);
        return res;
    }

    public static void helper(TreeNode root, List<Integer> val){
        if(root==null) return;
        val.add(root.val);
        helper(root.left,val);
        helper(root.right,val);
    }
}
