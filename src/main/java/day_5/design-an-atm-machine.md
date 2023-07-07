# 2241. Design an ATM Machine

https://leetcode.com/problems/design-an-atm-machine/

```java
class ATM {
    private final long[] nominates;
    private final long[] banknotes;

    public ATM() {
        nominates = new long[]{20, 50, 100, 200, 500};
        banknotes = new long[5];
    }

    public void deposit(int[] banknotesCount) {
        for(int i = 0; i < banknotesCount.length; i++) {
            banknotes[i] += banknotesCount[i];
        }
    }

    public int[] withdraw(int amount) {
        int[] res = new int[5];
        for (int i = nominates.length - 1; i >= 0; i--) {
            res[i] = (int) Math.min(amount / nominates[i], banknotes[i]);
            amount -= res[i] * nominates[i];
        }
        if(amount == 0) {
            for(int i = 0; i < banknotes.length; i++) {
                banknotes[i] -= res[i];
            }
            return res;
        }
        return new int[]{-1};
    }
}
```