# 20. Valid Parentheses

https://leetcode.com/problems/valid-parentheses/

```java
class Solution {
    // "()"
    // true
    
    // "()[]{}"
    // true
    
    // "(]"
    // false
    
    public boolean isValid(String s) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('}', '{');
        brackets.put(')', '(');
        brackets.put(']', '[');
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()) {
            if(brackets.containsKey(c) && stack.peek() == brackets.get(c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
```
