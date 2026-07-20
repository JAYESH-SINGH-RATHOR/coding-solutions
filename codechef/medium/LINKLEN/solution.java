public static int getLength(Node head) {
     //write code here...
     Node temp = head;
     int len = 0;
     while(temp != null){
         len++;
         temp = temp.next;
     }
     return len;
 }