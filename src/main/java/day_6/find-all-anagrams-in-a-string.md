# 438. Find All Anagrams in a String

https://leetcode.com/problems/find-all-anagrams-in-a-string/

```java
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> charsP = new HashMap<>();
        for(char c : p.toCharArray()) {
            charsP.put(c, charsP.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> charsS = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            charsS.put(s.charAt(i), charsS.getOrDefault(s.charAt(i), 0) + 1);
            if(i >= p.length()) {
                char c = s.charAt(i - p.length());
                if(charsS.get(c) > 1) {
                    charsS.put(c, charsS.get(c) - 1);
                } else {
                    charsS.remove(c);
                }
            }
            if(charsP.equals(charsS)) {
                result.add(i - p.length() + 1);
            }
        }
        return result;
    }
}
```
