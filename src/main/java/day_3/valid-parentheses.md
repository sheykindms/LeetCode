# 20. Valid Parentheses

https://leetcode.com/problems/valid-parentheses/

```java
class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('}', '{');
        brackets.put(')', '(');
        brackets.put(']', '[');
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()) {
            if(c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }
            else if(stack.isEmpty()) {
                return false;
            } else if(stack.peekFirst() == brackets.get(c)) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
```
