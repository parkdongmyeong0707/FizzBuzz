package lab1;

public class Multiples {
    // must be public AND static (and keep the exact signature)
    public static int multiples(int limit, int a, int b) {
        int sum = 0;

        // (optional) basic guards if your grader ever passes 0/negatives
        if (limit <= 0) return 0;
        if (a == 0 && b == 0) return 0;

        for (int i = 1; i < limit; i++) {
            // union of multiples; no double-counting even if a == b
            if ((a != 0 && i % a == 0) || (b != 0 && i % b == 0)) {
                sum += i;
            }
        }
        return sum;
    }
}
