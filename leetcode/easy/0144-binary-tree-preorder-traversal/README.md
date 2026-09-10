# Binary Tree Preorder Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `root` of a binary tree, return  *the preorder traversal of its nodes' values*.

 

 **Example 1:** 

 **Input:**  root = [1,null,2,3]

 **Output:**  [1,2,3]

 **Explanation:** 

 **Example 2:** 

 **Input:**  root = [1,2,3,4,5,null,8,null,null,6,7,9]

 **Output:**  [1,2,4,5,6,7,3,8,9]

 **Explanation:** 

 **Example 3:** 

 **Input:**  root = []

 **Output:**  []

 **Example 4:** 

 **Input:**  root = [1]

 **Output:**  [1]

 

 **Constraints:** 

- The number of nodes in the tree is in the range [0, 100].
- -100 <= Node.val <= 100

 

 **Follow up:**  Recursive solution is trivial, could you do it iteratively?

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.1 MB (beats 70.04%)  
**Submitted:** 2026-09-10T03:35:47.165Z  

```java
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        preorder(root, res);
        return res;        
    }

    private void preorder(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }

        res.add(node.val);
        preorder(node.left, res);
        preorder(node.right, res);
    }    
}
```

---

[View on LeetCode](https://leetcode.com/problems/binary-tree-preorder-traversal/)