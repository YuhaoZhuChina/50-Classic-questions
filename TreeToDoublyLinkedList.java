/*
 * Tree to Doubly Linked List
 * Given a tree, write a function to convert it into a circular doubly list from left to right by
 * only modifying the existing pointers.
 */
package treetodoublylinkedlist;

/**
 *
 * @author apple
 */
public class TreeToDoublyLinkedList {
    public class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        public TreeNode(int value){
            this.value = value;
        }
    }
    // node a and b both are circular linked list;
    public TreeNode concatenate(TreeNode a, TreeNode b){
        if(a == null) return b;
        if(b == null) return a;
        TreeNode aEnd = a.left;
        TreeNode bEnd = b.left;
        
        a.left = bEnd;
        bEnd.right = a;
        aEnd.right = b;
        b.left = aEnd;
        
        return a;
    }
    public TreeNode treeToList(TreeNode n){
        if(n == null) return n;
        TreeNode left = treeToList(n.left);
        TreeNode right = treeToList(n.right);
        
        // make a node into doubly linked list.
        n.left = n;
        n.right = n;
        
        n = concatenate(left, n);
        n = concatenate(n, right);
        
        return n;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
