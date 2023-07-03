# 283. Move Zeroes

https://leetcode.com/problems/move-zeroes/

```java
class Solution {
    // [0]
    // [0]

    // [0,1,0,3,12]
    // [1,3,12,0,0]

    // [0, 0, 1]
    // [1, 0, 0]

    public void moveZeroes(int[] nums) {
        int i = 0;
        for(int num: nums) {
            if(num != 0) {
                nums[i] = num;
                i++;
            }
        }
        while(i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }

}
```