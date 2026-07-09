/* Structure of a Linked List Node
class Node
{
    int data;
    Node next;
    Node(int d) {
       data = d;
       next = null;
    }
}*/
class Solution {
    public Node sortLL(Node head) {
        // code here
        if(head == null || head.next == null){
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;
        while(temp != null){
            list.add(temp.data);
            temp = temp.next;
        }
        Collections.sort(list);
        temp = head;
        for(int val : list){
            temp.data = val;
            temp = temp.next;
        }
        return head;
    }
}