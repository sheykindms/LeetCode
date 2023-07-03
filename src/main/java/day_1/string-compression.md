# 443. String Compression

https://leetcode.com/problems/string-compression/

```java
class Solution {
    // ["a"]
    // 1 ["a"]

    // ["a","a","b","b","c","c","c"]
    // 6 ["a","2","b","2","c","3"]

    // ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
    // 4 ["a","b","1","2"]

    public int compress(char[] chars) {
        char start;
        int j = 0;
        for(int i = 0; i < chars.length; i++) {
            int count = 1;
            start = chars[i];
            while(i < chars.length - 1 && chars[i] == chars[i + 1]) {
                i++;
                count++;
            }
            chars[j++] = start;
            if(count != 1) {
                char[] nums = String.valueOf(count).toCharArray();
                for(char num : nums) {
                    chars[j++] = num;
                }
            }
        }
        return j;
    }
}
```