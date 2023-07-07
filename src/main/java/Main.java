import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        isValid("()");
    }

    public static boolean isValid(String s) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('}', '{');
        brackets.put(')', '(');
        brackets.put(']', '[');
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()) {
            if(stack.peek() == brackets.get(c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for(int num : nums1) {
            s1.add(num);
        }
        Set<Integer> s2 = new HashSet<>();
        for(int num : nums2) {
            s2.add(num);
        }
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(int num : s1) {
            if (!s2.contains(num)) {
                l1.add(num);
            }
        }
        for(int num : s2) {
            if (!s1.contains(num)) {
                l2.add(num);
            }
        }
        return List.of(l1, l2);
    }
}
