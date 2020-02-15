/*
 * Swap Variables
 * Given two integers, write a function that swaps them without using any temporary variables.
 */
package swapvariables;

/**
 *
 * @author apple
 */
public class SwapVariables {

    public static void swapVariables(int x, int y){
        x = x+y;
        y = x-y;
        x = x-y;
    }
    public static void swapVariablesII(int x, int y){
        x = x^y;
        y = x^y;
        x = x^y;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
