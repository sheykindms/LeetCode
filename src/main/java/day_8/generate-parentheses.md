# 22. Generate Parentheses

https://leetcode.com/problems/generate-parentheses/

```java
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list, new StringBuilder(), 0, 0, n);
        return list;
    }

    public void backtrack(List<String> list, StringBuilder sb, int open, int close, int n) {
        if(sb.length() == 2 * n) {
            list.add(sb.toString());
            return;
        }
        if(open < n) {
            sb.append("(");
            backtrack(list, sb, open + 1, close, n);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(open > close) {
            sb.append(")");
            backtrack(list, sb, open, close + 1, n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
```
