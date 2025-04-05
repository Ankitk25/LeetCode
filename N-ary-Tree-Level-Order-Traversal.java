/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res= new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<Node> queue= new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int s= queue.size();
            ArrayList<Integer> lvl= new ArrayList<>();
            while(s>0){
                Node node = queue.poll();
                lvl.add(node.val);
                for(Node child: node.children){
                    if(child!=null){
                        queue.offer(child);
                    }
                }
                s--;
            }
            res.add(lvl);
        }
        return res;
    }
}