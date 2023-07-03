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

    // [1, 0, 1]
    // [1, 1, 0]

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

```java
class Solution {

    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[j] == 0 && nums[i] != 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[j] = temp;
                j++;
            } else if (nums[j] != 0) {
                j++;
            }
        }
    }
}
```
