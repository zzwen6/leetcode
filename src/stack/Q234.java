import java.util.Stack;

public class Q234 {
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public boolean isPalindrome(ListNode head) {
            Stack<Integer> stack = new Stack<>();
            
            ListNode node = head;
            int length = 0;
            while(node != null) { 
                node = node.next;
                length++;
            }
            node = head;
            for(int i=0;i<length/2;i++) {
                stack.push(node.val);
                node = node.next;
            }
            if(length%2 !=0) {
                node = node.next;
            }
            while(node != null) {
                if(node.val != stack.pop()) return false;
                node = node.next;
            }
            return true;
        }
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
