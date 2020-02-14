/*
 * Max Stacks
 * Implement a LIFO stack that has a push(), pop(), and max() function, where max() returns the maximum
 * value in the stack. All of these functions should run in O(1) time.
 */
package maxstacks;

/**
 *
 * @author zyh20
 */
public class MaxStacks {

    public class Node{
        int value;
        Node next;
        Node oldMax;
        public Node(int value){
            this.value = value;
        }
    }
    Node stack;
    Node Max;
    public MaxStacks(){}
    public void push(int value){
        Node node = new Node(value);
        if(stack == null)
            stack = node;
        else{
            node.next = stack;
            stack = node;
        }
        if(Max == null || node.value > Max.value){
            node.oldMax = Max;
            Max = node;
        }
    }
    public int pop(){
        if(stack == null) throw new NullPointerException();
        Node node = stack;
        stack = node.next;
        Max = node.oldMax;
        return node.value;
    }
    public int max(){
        if(Max == null) throw new NullPointerException();
        return Max.value;
    }
    public static void main(String[] args) {
        MaxStacks stack = new MaxStacks();
        stack.push(1);
        stack.push(2);
        stack.push(4);
        System.out.println(stack.max());
        System.out.println(stack.pop());
        System.out.println(stack.max());
    }
    
}
