# 151. Reverse Words in a String

https://leetcode.com/problems/reverse-words-in-a-string/

```java
class Solution {
    // "the sky is blue"
    // "blue is sky the"

    // "a good   example"
    // "example good a"

    public String reverseWords(String s) {
        int start;
        List<String> words = new ArrayList<>();
        for(int i  = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                start = i;
                while(i < s.length() && s.charAt(i) != ' ') {
                    i++;
                }
                words.add(s.substring(start, i));
            }
        }
        StringBuilder sb = new StringBuilder(words.get(words.size() - 1));
        for(int i = words.size() - 2; i >= 0; i--) {
            sb.append(' ');
            sb.append(words.get(i));
        }
        return sb.toString();
    }
}
```
