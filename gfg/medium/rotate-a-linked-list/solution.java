/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here
        Queue<Integer> q = new LinkedList<>();
        Node temp  = head;
        while(temp != null){
            q.add(temp.data);
            temp = temp.next;
        }
        // System.out.print("Q" + q);
        int n = q.size();
        k = k % n;
        int i = 0;
        while(i < k){
            q.add(q.remove());
            i++;
        }
        // System.out.print(q);
        temp = head;
        while(!q.isEmpty()){
            temp.data = q.remove();
            temp = temp.next;
        }
        return head;
    }
}