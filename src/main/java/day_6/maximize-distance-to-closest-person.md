# 849. Maximize Distance to Closest Person

https://leetcode.com/problems/maximize-distance-to-closest-person/

```java
class Solution {
    public int maxDistToClosest(int[] seats) {
        int res = 0;
        int left = -1;
        for(int i = 0; i < seats.length; i++) {
            if(seats[i] == 0) {
                continue;
            } else if(left == -1){ 
                res =  i;
            } else {
                res = Math.max(res, (i - left) / 2);
            }
            left = i;
        }
        return seats[seats.length - 1] == 0 ? Math.max(res, seats.length - left - 1) : res;
    }
}
```

```java
class Solution {
    public int maxDistToClosest(int[] seats) {
        int res = 0;
        int left = 0;
        while(left < seats.length && seats[left] == 0) {
            res++;
            left++;
        }
        int right = seats.length - 1;
        while(right >= 0 && seats[right] == 0) {
            res = Math.max(res, seats.length - right);
            right--;
        }
        for(int i = left; i <= right; i++) {
            int j = i;
            while(i < seats.length && seats[i] == 0) {
                res = Math.max(res, (i - j) / 2 + 1);
                i++;
            }
        }
        return res;
    }
}
```
