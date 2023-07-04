# 628. Maximum Product of Three Numbers

https://leetcode.com/problems/maximum-product-of-three-numbers/

```java
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], 
                        nums[nums.length - 1] *  nums[nums.length - 2] *  nums[nums.length - 3]);
    }
}
```

```java
class Solution {

    // [-100, -10, 1, 2, 3]
    // [3000]

    // [0, 1, 2, 3]
    // [6]
    public int maximumProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for(int num: nums) {
            if(num < min1) {
                min2 = min1;
                min1 = num;
            } else if(num < min2) {
                min2 = num;
            }
            if(num > max3) {
                max1 = max2;
                max2 = max3;
                max3 = num;
            } else if(num > max2) {
                max1 = max2;
                max2 = num;
            } else if(num > max1) {
                max1 = num;
            }
        }
        return Math.max(min1 * min2 * max3, max1 * max2 * max3);
    }
}
```
