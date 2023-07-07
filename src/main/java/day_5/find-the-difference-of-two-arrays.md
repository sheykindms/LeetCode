# 2215. Find the Difference of Two Arrays

https://leetcode.com/problems/find-the-difference-of-two-arrays/

```java
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for(int num : nums1) {
            s1.add(num);
        }
        Set<Integer> s2 = new HashSet<>();
        for(int num : nums2) {
            s2.add(num);
        }
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(int num : s1) {
            if (!s2.contains(num)) {
                l1.add(num);
            }
        }
        for(int num : s2) {
            if (!s1.contains(num)) {
                l2.add(num);
            }
        }
        return List.of(l1, l2);
    }
}
```