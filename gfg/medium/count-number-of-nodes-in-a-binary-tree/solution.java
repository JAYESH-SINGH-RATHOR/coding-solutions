class Solution {

    public int countNodes(Node root) {
        // code here
        if(root == null){
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int count = 0;
        while(!q.isEmpty()){
            Node curr = q.remove();
            count++;
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
        return count;
    }
}