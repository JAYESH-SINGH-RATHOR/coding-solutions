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
        Node nextt = curr.next;
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

class Solution {
    static int solve(Node root) {
        // A list with fewer than 3 nodes cannot have local extrema
       

        Node prev = root;
        Node curr = root.next;
        Node next = curr.next;
        int count = 0;

        while (next != null) {
            // Check for a local maximum (peak)
            if (curr.val > prev.val && curr.val > next.val) {
                count++;
            } 
            // Check for a local minimum (valley)
            else if (curr.val < prev.val && curr.val < next.val) {
                count++;
            }

            // Move all pointers forward by one step
            prev = curr;
            curr = next;
            next = next.next;
        }

        return count;
    }
}

