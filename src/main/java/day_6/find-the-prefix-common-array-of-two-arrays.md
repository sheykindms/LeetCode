# 2657. Find the Prefix Common Array of Two Arrays

https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/description/

```java
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> set = new HashSet<>();
        int[] res = new int[A.length];
        for(int i = 0; i < A.length; i++) {
            if(set.contains(B[i])) {
                res[i]++;
            } if(set.contains(A[i])) {
                res[i]++;
            } if(A[i] == B[i]) {
                res[i]++;
            }
            set.add(A[i]);
            set.add(B[i]);
            if(i > 0) {
                res[i] += res[i - 1];
            }
        }
        return res;
    }
}
```
