    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node deleteMid(Node head) {
        // code here
        if(head == null || head.next == null){
            return null;
        }
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        // System.out.print(size);
        temp = head;
        int mid = size / 2;
        Node prev = null;
        int idx = 0;
        while(idx < mid){
            prev = temp;
            temp = temp.next;
            idx++;
        }
        prev.next = temp.next;
        return head;
    }
}