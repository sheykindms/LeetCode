# 3. Longest Substring Without Repeating Characters

https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

```java
class Solution {
    //"abcabcbb"
    //3

    //"abba"
    //2

    //"wozxorw"
    //5

    //" "
    //1

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int idx = -1;
        char c;
        for(int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if(map.containsKey(c)) {
                idx = Math.max(map.get(c), idx);
            }
            map.put(c, i);
            max = Math.max(max, i - idx);
        }
        return max;
    }
}
```
