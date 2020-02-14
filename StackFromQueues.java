/*
 * StackFromQueues
 * Implement a LIFO stack with basic functionality (push and pop) using FIFO
 * queues to store the data.
 */
package stackfromqueues;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Yuhao
 */
public class StackFromQueues {
    private Queue<Integer> queue;
    // Constructor
    public StackFromQueues(){
        queue = new LinkedList<Integer>();
    }
    public void push(int x){
        insertAtTop(queue, x);
    }
    public void insertAtTop(Queue<Integer> queue, int x){
        if(queue.isEmpty()){
            queue.add(x);
            return;
        }
        int temp = queue.remove();
        insertAtTop(queue, x);
        queue.add(temp);
    }
    public int pop(){
        if(queue.isEmpty()) throw new IndexOutOfBoundsException();
        return queue.remove();
    }
    public static void main(String[] args) {
        StackFromQueues test = new StackFromQueues();
        for(int i=0; i<5; i++)
            test.push(i);
        System.out.println(test.pop());
    }
    
}
