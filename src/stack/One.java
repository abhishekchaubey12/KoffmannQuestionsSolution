/*   Created by IntelliJ IDEA.
 *   Author: Abhishek Kumar Chaubey
 *   Date: 20/02/2021
 *   Time: 16:25
 *   File: One.java
 */

package stack;

import java.util.Stack;

public class One {
    public static void main(String[] args) {


        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        Stack<Integer> stack3 = new Stack<Integer>();

        int[] digits = {-1, 15, 23, 44, 4, 99};
        for (int i = 0; i < digits.length; i++) {
            stack1.push(digits[i]);
        }
        System.out.println("The value at stack1- " + stack1);
        for (int i = 0; i < stack1.size(); i++) {
            stack3.push(stack1.get(i));
        }
        System.out.println("The value at stack3- " +  stack3);
        for (int i = 0; i < digits.length; i++) {
            stack2.push(digits[i]);
            stack3.push(digits[i]);
        }
        System.out.println("stack2 = " + stack2);

        while(!stack2.empty()){
            System.out.print("[ " + stack2.pop() + "\t" + stack3.pop() + " ]");
            System.out.println();
        }



        //System.out.println(stack1.get(stack1.size()-1));
        //System.out.println(stack2.get(stack2.size()-1));
        //System.out.println(stack3.get(stack3.size()-1));
    }


}