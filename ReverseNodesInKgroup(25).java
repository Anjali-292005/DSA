class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if (head == null || k == 1) {
            return head;
        }
        
        ListNode temp = head;
        int count = 0;
        
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }
        
        if (count < k) {
            return head;
        }
        
        ListNode prev = null;
        ListNode curr = head;
        
        for (int i = 0; i < k; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        head.next = reverseKGroup(curr, k);
        
        return prev;
    }
}
