# 643. Maximum Average Subarray I

https://leetcode.com/problems/maximum-average-subarray-i/

```java
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int current = sum;
        for(int i = k; i < nums.length; i++) {
            current += nums[i] - nums[i - k];
            sum = Math.max(sum, current);
        }
        return ((double) sum) / k;
    }
}
```
