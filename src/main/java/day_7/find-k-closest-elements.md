# 658. Find K Closest Elements

https://leetcode.com/problems/find-k-closest-elements/

```java
class Solution {
    //[0,0,1,2,3,3,4,7,7,8] 3 5
    //[3,3,4]

    //[1,1,1,10,10,10] 1 9
    //[10]

    //[1,2,3,4,5] 4 3
    //[1,2,3,4]

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        int start = 0;
        int end = arr.length - 1;
        while(end - start >= k) {
            if(Math.abs(arr[start] - x) <= Math.abs(arr[end] - x)) {
                end--;
            } else {
                start++;
            }
        }
        for(int i = start; i <= end; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
```
