// Node is defined as:
// class Node{
//     int val;
//     Node next;
//     Node(int x){
//     	val = x; next = null;
//     }
// }
class Solution {
    static int solve(Node root) {
        // A list with fewer than 3 nodes cannot have local extrema
        if (root == null || root.next == null || root.next.next == null) {
            return 0;
        }
        int count = 0;
        Node prev = root;
        Node curr = root.next;
        Node nextt = root.next;
        while(nextt != null){
            if(curr.val > prev.val && curr.val > nextt.val){
                count++;
            }
            else if(curr.val < prev.val && curr.val < nextt.val){
                count++;
            }
            prev = curr;
            curr = nextt;
            nextt = nextt.next;
        }
        return count;
    }
}
