import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class Solution {

    LinkedList queue;
    Stack stack;
    
    public Solution() {
        queue = new LinkedList();
        stack = new Stack();
    }
    
    void pushCharacter(char ch) {
        stack.push(ch);
    }
    
    void enqueueCharacter(char ch) {
        queue.addLast(ch);
    }
    
    char popCharacter() {
        return (char) stack.pop();
    }
    
    char dequeueCharacter() {
        return (char) queue.remove(0);
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String wordOrPhrase = null;
        boolean isPalindrome = true;
        Solution solution = new Solution();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            wordOrPhrase = reader.readLine();
            reader.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        for (int index = 0; index < wordOrPhrase.length(); index++) {
            solution.pushCharacter(wordOrPhrase.charAt(index));
            solution.enqueueCharacter(wordOrPhrase.charAt(index));
        }
        for (int index = 0; index < wordOrPhrase.length(); index++) {
            char frontCharacter = solution.dequeueCharacter();
            char topCharacter = solution.popCharacter();
            if (frontCharacter == topCharacter) {
                continue;
            }
            else {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome == false) {
            System.out.println("The word, " + wordOrPhrase + ", is not a palindrome.");
        } else {
            System.out.println("The word, " + wordOrPhrase + ", is a palindrome.");
        }
        
    }
}
