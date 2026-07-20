/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/


class Solution {
    public static Node detectCycle(Node head){
        // Add code here
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                 slow = head;
                 while(slow != fast){
                     slow = slow.next;
                     fast = fast.next;
                 }
                 return slow;
            }
        }
        return null;
    }
}