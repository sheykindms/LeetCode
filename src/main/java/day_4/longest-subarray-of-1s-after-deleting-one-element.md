# 1493. Longest Subarray of 1's After Deleting One Element

https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/

```java
class Solution {

    // [1,1,0,1]
    // 3

    // [0,1,1,0,1,1,0,1]
    // 4

    // [1,1,1]
    // 2

    public int longestSubarray(int[] nums) {
        int zeroes = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            int counter = 0;
            if(nums[i] == 1 && (i - 1 < 0 || nums[i - 1] == 0)) {
                int j = i;
                while(j < nums.length && zeroes < 2) {
                    if(nums[j] == 0) {
                        zeroes++;
                    } else {
                        counter++;
                    }
                    j++;
                }
                zeroes = 0;
                sum = Math.max(sum, counter);
            }
        }
        return sum == nums.length ? sum - 1 : sum;
    }
}
```