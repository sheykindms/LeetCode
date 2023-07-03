# 228. Summary Ranges

https://leetcode.com/problems/summary-ranges/

```java
class Solution {

    //[0]
    //["0"]

    // [0,1,2,4,5,7]
    // ["0->2","4->5","7"]

    // [0,2,3,4,6,8,9]
    // ["0","2->4","6","8->9"]

    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < nums.length) {
            int start = nums[i];
            while(i < nums.length - 1 && nums[i + 1] - nums[i] == 1) {
                i++;
            }
            if(start == nums[i]) {
                res.add(start + "");
            } else {
                res.add(start + "->" + nums[i]);
            }
            i++;
        }
        return res;
    }
}
```