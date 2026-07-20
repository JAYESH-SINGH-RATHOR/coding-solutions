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
   while(head != null && head.data == key){
       head = head.next;
   }
   Node temp = head;
   while(temp != null && temp.next != null){
       if(temp.next.data == key){
           temp.next = temp.next.next;
       }
       else{
           temp = temp.next;
       }
   }
   return head;
}