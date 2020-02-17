/*
 * Given an unsorted linked list, write a function to remove all the duplicates.
 * e.g. dedup(1->2->3->2->1) = 1->2->3
 */
package deduplinkedlist;

import java.util.HashSet;

/**
 *
 * @author zyh20
 */
public class DedupLinkedList {

    public static class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
    public static Node Dedup(Node n){
        Node prev = new Node(0);
        prev.next = n;
        Node curr = n;
        HashSet<Integer> set = new HashSet<Integer>();
        while(curr != null){
            if(set.contains(curr.value)){
                curr = curr.next;
                continue;
            }
            if(prev.next != curr)
                prev.next = curr;
            set.add(curr.value);
            prev = curr;
            curr = curr.next; 
        }
        prev.next = null;
        return n;
    }
    public static void printLinkedList(Node n){
        while(n != null){
            System.out.println(n.value);
            n = n.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        b.next = a;
        Node c = new Node(3);
        c.next = b;
        Node d = new Node(2);
        d.next = c;
        Node e = new Node(1);
        e.next = d;
        printLinkedList(e);
        Node n = Dedup(e);
        printLinkedList(n);
        
    }
    
}
