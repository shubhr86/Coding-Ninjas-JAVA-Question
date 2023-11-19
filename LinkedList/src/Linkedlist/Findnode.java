package Linkedlist;

import java.util.Scanner;

public class Findnode {
    // Java class names should start with a capital letter
    // for better readability and convention.
	
    public static node<Integer> takeInput() {
        node<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while (data != -1) {
            node<Integer> newNode = new node<Integer>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }
	
    public static void print(node<Integer> head) {
        node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
	
    public static int findNode(node<Integer> head, int n) {
        node<Integer> temp = head;
        if (head == null) {
            return -1;
        }
        int ans = 0;
        while (temp != null) {
            if (temp.data == n) {
                return ans;
            }
            ans++;
            temp = temp.next;
        }
        return -1;
    }
	
    public static void main(String[] args) {
        node<Integer> head = takeInput(); 
        print(head);
		
        // Example usage of findNode method:
        int nodeIndex = findNode(head, 3);
        if (nodeIndex != -1) {
            System.out.println("Node found at index: " + nodeIndex);
        } else {
            System.out.println("Node not found");
        }
    }
}