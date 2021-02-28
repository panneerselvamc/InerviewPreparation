package com.learning.problems.binarysearchtree;

import java.util.ArrayList;

public class TreeLeftView {
    Node root=null;
    int max_level=0;
    static class Node{
        int data;
        Node left,right;
        Node(int value){
            this.data=value;
            this.left=this.right=null;
        }
    }
    public void printLeftView(){
        ArrayList<Integer> list=new ArrayList<>();
        helper(1,root);
    }
    public void helper(int level,Node root){
        if(root==null){
            return ;
        }

        if(max_level<level){
            System.out.println(root.data);
            max_level=level;
        }
        helper(level+1,root.left);
        helper(level+1,root.right);

    }

    public static void main(String[] args) {
        TreeLeftView tree=new TreeLeftView();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.printLeftView();
    }
}


//LINK: https://www.geeksforgeeks.org/print-left-view-binary-tree/