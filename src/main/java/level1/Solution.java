package level1;

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

    // Find the Missing Number in a Set of Numbers from 1 to 10
    public static int sum_1toN(int n) {
        return (n + 1) * n / 2;
    }

    public static int findMissingNumber(int[] arr) {
        final int sum_10 = sum_1toN(10);
        int sum_arr = 0;
        for (int x: arr)
            sum_arr += x;
        return sum_10 - sum_arr;
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

    // Insert a Node at the End of a Linked List
    public static ListNode insertAtTail(ListNode head, int data) {
        ListNode curr = head, node = new ListNode(data);
        while (curr != null && curr.next != null)
            curr = curr.next;
        if (curr == null)
            return node;
        else {
            curr.next = node;
            return head;
        }
    }

    // Find the Middle of a List in a Single Pass
    public static ListNode findMiddleNode(ListNode head) {
        ListNode slow_curr = head, fast_curr = head;
        while (slow_curr != null && fast_curr != null)
        {
            fast_curr = fast_curr.next;
            if (fast_curr != null && fast_curr.next != null)
                fast_curr = fast_curr.next;
            else
                break;
            slow_curr = slow_curr.next;
        }
        return slow_curr;
    }

    // Flip it!
    public static void flipItVerticalAxis(int[][] matrix) {
        for(int row_idx=0; row_idx<matrix.length; row_idx++) {
            int row_len = matrix[row_idx].length;
            for(int col_idx=0; col_idx < row_len/2; col_idx++)
                swap(matrix[row_idx], col_idx, row_len - col_idx - 1);
        }
    }

    public static void printMatrix(int[][] matrix) {
        for(int row_idx=0; row_idx<matrix.length; row_idx++) {
            StringBuilder builder = new StringBuilder();
            for(int col_idx=0; col_idx<matrix[row_idx].length; col_idx++) {
                builder.append(matrix[row_idx][col_idx]);
                builder.append(' ');
            }
            System.out.println(builder.toString());
        }
    }

    public static void swap(int[] arr, int idx_1, int idx_2) {
       int temp = arr[idx_1];
       arr[idx_1] = arr[idx_2];
       arr[idx_2] = temp;
    }

    public static void main(String[] args) {
        //int[][] matrix = {{1, 2}, {3, 4}};
        int[][] matrix = {{1,2,3},{4,5,6}};
        printMatrix(matrix);
        System.out.println("--------");
        flipItVerticalAxis(matrix);
        printMatrix(matrix);
    }
}
