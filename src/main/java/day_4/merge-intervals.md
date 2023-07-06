# 56. Merge Intervals

https://leetcode.com/problems/merge-intervals/

```java
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> list = new ArrayList<>();
        int min1 = intervals[0][0];
        int max1 = intervals[0][1];
        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] == min1 || intervals[i][0] <= max1) {
                max1 = Math.max(intervals[i][1], max1);
            } else {
                list.add(new int[]{min1, max1});
                min1 = intervals[i][0];
                max1 = intervals[i][1];
            }
        }
        list.add(new int[]{min1, max1});
        return list.toArray(new int[0][0]);
    }
}
```