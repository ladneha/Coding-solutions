class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode curr1 = l1;
        ListNode curr2 = l2;
       
        ListNode result = new ListNode(0);
        ListNode t = result;
        int sum = 0;
        while(curr1!=null || curr2!=null){
           sum = sum/10; 
           if(curr1 != null){
               sum = sum +curr1.val;
               curr1 = curr1.next;
           }
            if(curr2 != null){
                sum = sum + curr2.val;
                curr2 = curr2.next;
              }
        
            t.next = new ListNode(sum%10);
            t = t.next;
            }
           if(sum/10 ==1){
               t.next = new ListNode(1);
           }
        
        return result.next; 
    }
}