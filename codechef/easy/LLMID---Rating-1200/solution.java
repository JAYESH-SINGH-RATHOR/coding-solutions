/*class Node{
    int val;
    Node next;
    Node(int x){
    	val = x; next = null;
    }
}*/

static int getMiddleElement(Node head){
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
    }
    return slow.val;
     
}