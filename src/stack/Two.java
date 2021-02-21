/*   Created by IntelliJ IDEA.
 *   Author: Abhishek Kumar Chaubey
 *   Date: 21/02/2021
 *   Time: 12:15
 *   File: Two.java
 */

package stack;

import java.util.Scanner;
import java.util.Stack;

public class Two {
    /**
     * 4.1 - Write a method that reads a line and reverses the words in the line (not the characters)
     * using a stack. For example, given the following input:
     * The quick brown fox jumps over the lazy dog.
     */
    public static void reverse(String string) {
        Stack<String> stack = new Stack<>();
        String temp = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                stack.push(temp);
                temp = "";
            } else {
                temp = temp + string.charAt(i);
            }
        }
        stack.push(temp);
        while (!stack.isEmpty()) {
            temp = stack.peek();
            System.out.print(temp + " ");
            stack.pop();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // str = (" The quick brown fox run over the lazy dog");
        // reverse(str);
        String reverse = "", original = "";
        Scanner scanner = new Scanner(System.in);
        original = scanner.nextLine();
        scanner.close();
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (reverse.equals(original)) {
            System.out.println("The pallindrome is  = " + reverse);
        } else
            System.out.println(reverse + " is not pallindrome");
    }


}