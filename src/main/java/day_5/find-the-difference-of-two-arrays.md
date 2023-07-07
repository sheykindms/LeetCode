# 2215. Find the Difference of Two Arrays

https://leetcode.com/problems/find-the-difference-of-two-arrays/

```java
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for(int i : nums1) {
            s1.add(i);
        }
        Set<Integer> s2 = new HashSet<>();
        for(int i : nums2) {
            s2.add(i);
        }
        for(int num: nums2) {
            if(s1.contains(num) && s2.contains(num)) {
                s2.remove(num);
                s1.remove(num);
            }
        }
        return List.of(List.copyOf(s1), List.copyOf(s2));
    }
}
```
