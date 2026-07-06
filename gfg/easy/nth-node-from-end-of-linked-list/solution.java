/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
            
        }
        // System.out.print(size);
       if (k > size || k <= 0) {
            return -1;
        }
        int target = size - k;
        temp = head;
        for(int i = 0; i < target; i++){
            temp = temp.next;
        }
        return temp.data;
    }
}