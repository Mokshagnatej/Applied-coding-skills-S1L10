# Binary Tree Paths

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given the `root` of a binary tree.

Return all  **root-to-leaf**  paths in  **any order**.

A  **leaf**  is a node with no children.

 

 **Example 1:** 

```
Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]

```

 **Example 2:** 

```
Input: root = [1]
Output: ["1"]

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [1, 100].
- -100 <= Node.val <= 100

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.87%)  
**Memory:** 43.7 MB (beats 94.31%)  
**Submitted:** 2026-09-10T04:13:02.398Z  

```java
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();

        if (root == null)
            return res;

        StringBuilder path = new StringBuilder();
        path.append(root.val);
        backtrack(root, path, res);

        return res;
    }

    private void backtrack(TreeNode root, StringBuilder path, List<String> res) {
        if (root.left == null && root.right == null) {
            res.add(path.toString());
            return;
        }

        int size = path.length();

        if (root.left != null) {
            path.append("->").append(root.left.val);
            backtrack(root.left, path, res);
            path.setLength(size);
        }

        if (root.right != null) {
            path.append("->").append(root.right.val);
            backtrack(root.right, path, res);
            path.setLength(size);
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/binary-tree-paths/)