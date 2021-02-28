package com.learning.binarysearchtree;

public class Insert {
    private Node root=null;

    class Node{


        private int key;
        private Node left,right;
        Node(int key){
            this.key=key;
            left=right=null;
        }


    }
    public void insertKey(int key){
        root=insertIntoTree(root,key);
    }
    public Node insertIntoTree(Node rootNode,int key){
        if(rootNode==null){
            rootNode=new Node(key);
           return rootNode;
        }
        else if (key < rootNode.key){
           rootNode.left= insertIntoTree(rootNode.left,key);
        }
        else if (key > rootNode.key){
            rootNode.right=insertIntoTree(rootNode.right,key);
        }

        return rootNode;
    }

    public static void main(String[] args) {
        Insert insert=new Insert();
        insert.insertKey(1);
        insert.insertKey(3);
        insert.insertKey(4);
        insert.insertKey(5);
        insert.insertKey(6);
    }
}
