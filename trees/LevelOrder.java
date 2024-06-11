/**
 * Definition for a binary tree node.
 * struct TreeNode {
 * int val;
 * TreeNode *left;
 * TreeNode *right;
 * TreeNode() : val(0), left(nullptr), right(nullptr) {}
 * TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 * TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left),
 * right(right) {}
 * };
 */

//https://leetcode.com/problems/binary-tree-level-order-traversal/description/
package trees;

public class LevelOrder {

public: vector<vector<int>> level(TreeNode root){
    ArrayList<ArrayList<Integer>> result=new ArrayList<>();
    if(root==null){
        return result;
    }

    Queue <TreeNode> queue=new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
        int levelSize=queue.size();
ArrayList<Integer> currentLevel=new ArrayList<>();
        for(int i=0;i<levelSize;i++){
            TreeNode currentNode=queue.poll();
            currentLevel.add(currentNode.val);
            if(currentNode.left!=null){
                queue.offer((currentNode.left);
            }
            if(currentNode.right!=null){
                queue.offer((currentNode.right);
            }
        }
        result.add(currentLevel);
    }
return result;
}
};
