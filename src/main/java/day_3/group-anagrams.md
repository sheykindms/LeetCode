# 49. Group Anagrams

https://leetcode.com/problems/group-anagrams/

```java
class Solution {

    // ["eat","tea","tan","ate","nat","bat"]
    // [["bat"],["nat","tan"],["ate","eat","tea"]]

    // [""]
    // [[""]]

    // ["a"]
    // [["a"]]


    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String key = computeKey(str);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return List.copyOf(map.values());
    }

    public String computeKey(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
```
