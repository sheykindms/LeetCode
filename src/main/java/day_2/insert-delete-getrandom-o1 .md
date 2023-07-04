# 380. Insert Delete GetRandom O(1)

https://leetcode.com/problems/insert-delete-getrandom-o1/

```java
class RandomizedSet {

    private final Map<Integer, Integer> map;
    private final List<Integer> list;
    private final Random random;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if(!map.containsKey(val)) {
            map.put(val, list.size());
            list.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        Integer index = map.get(val);
        if(index != null) {
            Integer lastElement = list.get(list.size() - 1);
            list.set(index, lastElement);
            map.put(lastElement, index);
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
```
