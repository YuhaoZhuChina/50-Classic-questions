/*
 * Gray Code 
 * Given two integers, write a function to determine whether ot not their binary respresentations differ 
 * by a single bit.
 */
package graycode;

/**
 *
 * @author zyh20
 */
public class GrayCode {

    public static boolean isGrayCode(int a, int b){
        int x = a^b;
        while(x > 0){
            if(x % 2 == 1 && x>>1 > 0) return false;
            x = x>>1;
        }
        return true;
    }
    public static boolean isGrayCodeII(int a, int b){
        int x = a^b;
        return (x&(x-1)) == 0;
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(isGrayCode(a, b));
        System.out.println(isGrayCodeII(a, b));
    }
    
}
