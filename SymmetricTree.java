/**
 Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3

 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q =  new LinkedList<>();
        if(root==null){
            return true;
        }else{
        q.add(root.left);
        q.add(root.right);
        while(! q.isEmpty()){
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if(t1==null && t2 ==null){
                continue;
            }
            if((t1==null && t2!=null) || (t2==null && t1!=null)){
                return false;
            }
            if(t1.val != t2.val){
                return false;
            }
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }
        }
        return true;
    }
}