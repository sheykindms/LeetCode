# 567. Permutation in String

https://leetcode.com/problems/permutation-in-string/

```java
class Solution {
    //s1 = "ab", s2 = "eidbaooo"
    //true

    //s1 = "ab", s2 = "eidboaoo"
    //false

    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> chars1 = new HashMap<>();
        for(char c: s1.toCharArray()) {
            chars1.put(c, chars1.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> chars2 = new HashMap<>();
        int len = s1.length();
        for(int i = 0; i < s2.length(); i++) {
            chars2.put(s2.charAt(i), chars2.getOrDefault(s2.charAt(i), 0) + 1);
            if(i >= len) {
                char old = s2.charAt(i - len);
                if(chars2.get(old) > 1) {
                    chars2.put(old, chars2.get(old) - 1);
                } else {
                    chars2.remove(old);
                }
            }
            if(chars1.equals(chars2)) {
                return true;
            }
        }
        return false;
    }
}
```
