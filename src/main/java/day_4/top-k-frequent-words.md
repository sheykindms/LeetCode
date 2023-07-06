# 692. Top K Frequent Words

https://leetcode.com/problems/top-k-frequent-words/

```java
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        Map<String, Integer> map = new HashMap<>();
        for(String word: words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((o1, o2) -> { 
            if(o2.getValue() - o1.getValue() == 0) {
                return o1.getKey().compareTo(o2.getKey());
            } 
            return o2.getValue().compareTo(o1.getValue());
        });
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            pq.add(entry);
        }
        List<String> list = new ArrayList<>();
        for(int i = 0; i < k; i++) {
            list.add(pq.remove().getKey());
        }
        return list;
    }
}
```