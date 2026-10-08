# Course Schedule II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

There are a total of `numCourses` courses you have to take, labeled from `0` to `numCourses - 1`. You are given an array `prerequisites` where `prerequisites[i] = [ai, bi]` indicates that you  **must**  take course `bi` first if you want to take course `ai`.

- For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.

Return  *the ordering of courses you should take to finish all courses*. If there are many valid answers, return  **any**  of them. If it is impossible to finish all courses, return  **an empty array**.

 

 **Example 1:** 

```
Input: numCourses = 2, prerequisites = [[1,0]]
Output: [0,1]
Explanation: There are a total of 2 courses to take. To take course 1 you should have finished course 0. So the correct course order is [0,1].

```

 **Example 2:** 

```
Input: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
Output: [0,2,1,3]
Explanation: There are a total of 4 courses to take. To take course 3 you should have finished both courses 1 and 2. Both courses 1 and 2 should be taken after you finished course 0.
So one correct course order is [0,1,2,3]. Another correct ordering is [0,2,1,3].

```

 **Example 3:** 

```
Input: numCourses = 1, prerequisites = []
Output: [0]

```

 

 **Constraints:** 

- 1 <= numCourses <= 2000
- 0 <= prerequisites.length <= numCourses * (numCourses - 1)
- prerequisites[i].length == 2
- 0 <= ai, bi < numCourses
- ai != bi
- All the pairs [ai, bi] are distinct.

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 81.30%)  
**Memory:** 47.1 MB (beats 26.76%)  
**Submitted:** 2026-10-08T03:55:59.295Z  

```java
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjacencyList = new ArrayList<>(numCourses);
        int[] courseOrder = new int[numCourses];
        int[] inDegree = new int[numCourses];
        int coursesCompleted = 0;
        int idx = 0;


        for (int i = 0; i < numCourses; i++)
            adjacencyList.add(new ArrayList<>());


        for (int[] arr : prerequisites) {
            adjacencyList.get(arr[1]).add(arr[0]);
            inDegree[arr[0]]++;
        }


        Deque<Integer> q = new ArrayDeque<>();


        for (int i = 0; i < numCourses; i++)
            if (inDegree[i] == 0)
                q.addLast(i);


        while (!q.isEmpty()) {
            int course = q.removeFirst();
            courseOrder[idx] = course;
            coursesCompleted++;
            idx++;


            for (int neighbour : adjacencyList.get(course)) {
                inDegree[neighbour]--;


                if (inDegree[neighbour] == 0)
                    q.addLast(neighbour);
            }
        }


        return coursesCompleted == numCourses ? courseOrder : new int[0];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/course-schedule-ii/)