/*
 * Palindromes
 * Given a linked list, write a function to determine whether the list is a palindrome
 */
package palindromes;

import java.util.Stack;

/**
 *
 * @author zyh20
 */
// This question literally is about how to find the middle one of the LinkedList
public class Palindromes {

    public class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
    public static boolean isPalindromes(Node node){
        Stack<Integer> stack = new Stack<Integer>();
        Node slow = node;
        Node fast = node;
        while(fast != null && fast.next != null){
            stack.push(slow.value);
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null) slow = slow.next;
        while(slow != null){
            if(stack.pop() != slow.value) return false;
            slow = slow.next;
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
