/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pathP = new ArrayList<>();
        List<TreeNode> pathQ = new ArrayList<>();
        findPath(root, p ,  pathP);
        findPath(root, q, pathQ);
        TreeNode lca = null;
        for(int i = 0; i<pathP.size()&& i <pathQ.size(); i ++){
            if(pathP.get(i).val == pathQ.get(i).val){
                lca = pathP.get(i);

            }else{
                break;
        }
        }
        return lca;
        }
        private boolean findPath(TreeNode root, TreeNode target,List<TreeNode> path){
            if(root == null){

                return false;
            }
            path.add(root);
            if(root == target){
                return true;
            }
            if(findPath(root.left, target,path)||
            findPath(root.right, target,path)){
                return true;
            }
            path.remove(path.size() -1 );
            return false;
        }
    }
