// class Node {
//     int data;
//     Node next;

//     Node(int val) {
//         data = val;
//         next = null;
//     }
// }


static Node removeKey(Node head, int key) {
    //write code here...
    if(head == null){
        return new Node(-1);
    }
    while( head != null && head.data == key ){
        head = head.next;
    }
    Node curr = head;
    while(curr != null && curr.next != null){
        if(curr.next.data == key){
            curr.next = curr.next.next;
        }else{
            curr = curr.next;
        }
    }
    return head;
}