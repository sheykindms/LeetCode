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
        String[] strsSorted = new String[strs.length];
        for(int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            strsSorted[i] = new String(temp);
        }
        List<List<String>> res = new ArrayList<>();
        for(int i = 0; i < strs.length; i++) {
            List<String> group = new ArrayList<>();
            if(strsSorted[i] != null) {
                group.add(strs[i]);
                for(int j = 0; j < strs.length; j++) {
                    if(strsSorted[i].equals(strsSorted[j]) && strsSorted[j] != null && i != j) {
                        group.add(strs[j]);
                        strsSorted[j] = null;
                    }
                }
                strsSorted[i] = null;
                if(!group.isEmpty()) {
                    res.add(group);
                }
            }
        }
        return res;

    }
}
```
