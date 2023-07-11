# 763. Partition Labels

https://leetcode.com/problems/partition-labels/

```java
class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> chars = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            chars.put(s.charAt(i), i);
        }
        List<Integer> list = new ArrayList<>();
        int curr = -1;
        int max = 0;
        for(int i = 0; i < s.length(); i++) {
            max = Math.max(chars.get(s.charAt(i)), max);
            if(max == i) {
                list.add(i - curr);
                curr = i;
            }
        }
        return list;
    }
}
```
