package Linked_List;

public class MergeLink{
    public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       
        ListNode dummy = new ListNode(-1);
        ListNode p1 = dummy ;
        ListNode p2 = list1 ;
        ListNode p3 = list2 ;

        while(p2 != null && p3 != null){
            if(p2.val > p3.val){
                p1.next = p3 ;
                p3 = p3.next ;
            }else{
                p1.next = p2 ;
                p2 = p2.next ;
            }
              p1 = p1.next ;
          
        }

        if(p2 != null){
            p1.next = p2 ;
        }
        if(p3 != null){
            p1.next = p3 ;
        }

        return dummy.next ;
    }
}