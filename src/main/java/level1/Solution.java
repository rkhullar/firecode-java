package level1;

import java.awt.event.HierarchyListener;

public class Solution {

    // Fibonacci Number
    public static int fib(int n) {
        return recursiveFibonacci(n);
    }

    public static int recursiveFibonacci(int n) {
        if (n == 0 || n == 1)
            return  n;
        else
            return fib(n-1) + fib(n-2);
    }

    // Delete a List's Head Node
    public static ListNode deleteAtHead(ListNode head) {
        if (head != null) {
            ListNode curr = head.next;
            head.next = null;
            return curr;
        } else {
            return null;
        }
    }

}
