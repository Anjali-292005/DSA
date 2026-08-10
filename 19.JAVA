class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }

        if(n>count) return head;
        if(n == count) return head.next;
        temp = head;
        int i=1;
        while(temp !=null && i+n <count)
        {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;


        
    }
}