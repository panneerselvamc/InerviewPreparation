package com.learning.linkedlist;

public class BasicOperation {
    Node head=null;
    class Node{
        int data;
        Node next;
        Node(int value){
            this.data=value;
            this.next=null;
        }
    }

    public void insert(int value){
        Node temp=head;
        Node newNode=new Node(value);
        if(head==null){
            head=newNode;
        }
        else {
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    public void insertAtHead(int key){
        Node newNode=new Node(key);
        Node temp=head;
        newNode.next=temp;
        head=newNode;
    }

    public void printData(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void removeHead(){
        if(head!=null){
            head=head.next;
        }else {
            System.out.println("HEAD IS EMPTY");
        }
    }

    public void removeAParticularNode(int key){
        Node temp=head;

        while (temp!=null ){
            if(temp.next!=null && temp.next.data==key){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
    }

    public static void main(String[] args) {

        BasicOperation basicOperation=new BasicOperation();
        basicOperation.insert(1);
        basicOperation.insert(2);
        basicOperation.insert(3);
        basicOperation.insert(4);
        basicOperation.insert(5);


        System.out.println("******************** LIST OF AVAILABLE NODES ********************");
        basicOperation.printData();

        System.out.println("******************** INSERTING 22 AT HEAD ********************");
        basicOperation.insertAtHead(22);
        basicOperation.printData();


        System.out.println("******************** REMOVING HEAD ********************");
        basicOperation.removeHead();
        basicOperation.printData();

        System.out.println("******************** REMOVING A PARTICULAR NODE ********************");
        basicOperation.removeAParticularNode(5);
        basicOperation.printData();

    }
}
