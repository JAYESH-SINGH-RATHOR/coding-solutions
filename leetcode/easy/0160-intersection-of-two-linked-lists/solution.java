public class Solution {
    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     if (headA == null || headB == null) {
    //         return null;
    //     }

    //     ListNode pA = headA;
    //     ListNode pB = headB;

    //     while (pA != pB) {
    //         pA = (pA == null) ? headB : pA.next;
    //         pB = (pB == null) ? headA : pB.next;
    //     }

    //     return pA; 
    // }

        // method 2
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            while(temp1 != null){
                temp1 = temp1.next;
                return headB;
            }while(temp2 != null){
                temp2 = temp2.next;
                return headA;
            }
        }
        return temp1;
    }
}
