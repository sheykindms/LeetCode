# 680. Valid Palindrome II

https://leetcode.com/problems/valid-palindrome-ii/

```java
class Solution {
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return isPalindrome(start, end - 1, s) || isPalindrome(start + 1, end, s);
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean isPalindrome(int start, int end, String s) {
        while(start < end) {
            if(s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
```