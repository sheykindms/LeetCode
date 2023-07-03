# 1. Two Sum


https://leetcode.com/problems/two-sum/

```java
class Solution {
    // [2,7,11,15] 9
    // [0,1]

    // [1,5,5,11] 10
    // [1,2]

    // [3,3] 6
    // [0,1]


    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            numToIndex.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++) {
            if(numToIndex.get(target - nums[i]) != null && i != numToIndex.get(target - nums[i])) {
                res[0] = i;
                res[1] = numToIndex.get(target - nums[i]);
            }
        }
        return res;
    }
}
```