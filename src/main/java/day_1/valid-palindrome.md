# 125. Valid Palindrome

https://leetcode.com/problems/valid-palindrome/

```java
class Solution {
    // "A man, a plan, a canal: Panama"
    // true

    // "race a car"
    // false

    // " "
    // true

    public boolean isPalindrome(String s) {
        String lowercase = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while(start < end) {
            if(!Character.isLetterOrDigit(lowercase.charAt(start))) {
                start++;
            } else if(!Character.isLetterOrDigit(lowercase.charAt(end))) {
                end--;
            } else if (lowercase.charAt(start) != lowercase.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
}
```