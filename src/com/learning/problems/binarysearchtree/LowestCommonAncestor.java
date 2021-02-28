package com.learning.problems.binarysearchtree;

import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class LowestCommonAncestor
{
    Node root=null;
    ArrayList<Integer> al1=new ArrayList<>();
    ArrayList<Integer> al2 = new ArrayList<>();

    int  findLCA(int n1,int n2){
        al1.clear();
        al2.clear();
        return lcaUtil(n1,al1,n2,al2);
    }
    int lcaUtil(int n1,List al1,int n2, List al2){

        if(!helper(n1,al1,root) || !helper(n2,al2,root)){
            return -1;
        }
        int i=0;
        for( i=0;i<al1.size() && i< al2.size();i++){
            if(!al1.get(i).equals(al2.get(i))){
                break;
            }

        }
        return (int) al1.get(i-1);


    }

    boolean helper(int node, List arrayList, Node root){
        if(root==null){
            return false;
        }
        arrayList.add(root.data);

        if(root.data==node){
            return true;
        }

        if(root.left!=null && helper(node,arrayList,root.left)){
            return true;
        }
        if(root.right!=null && helper(node,arrayList,root.right)){
            return true;
        }
         //        Removing data from arrayList
        arrayList.remove(arrayList.size()-1);
        return false;
    }


    // Driver code
    public static void main(String[] args)
    {
        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("LCA(4, 5): " + tree.findLCA(4,5));
        System.out.println("LCA(4, 6): " + tree.findLCA(4,6));
        System.out.println("LCA(3, 4): " + tree.findLCA(3,4));
        System.out.println("LCA(2, 4): " + tree.findLCA(2,4));

    }
}

//LINK: https://www.geeksforgeeks.org/lowest-common-ancestor-binary-tree-set-1/