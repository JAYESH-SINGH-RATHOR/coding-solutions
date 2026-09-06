/*Structure of binary tree Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
};*/

class Solution {
    int ans = 0;
    public int diameter(Node root) {
        // code here
        if(root == null){
            return 0;
        }
        dia(root);
        return ans;
    }
    public int dia(Node root){
        if(root == null){
            return 0;
        }
        int left = dia(root.left);
        int right = dia(root.right);
        ans = Math.max(ans , left + right);
        return Math.max(left , right) + 1;
    }
}