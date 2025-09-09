package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples()); // uses the default
    }

    // Default version for tests that expect no arguments
    public static int multiples() {
        return multiples(1000, 3, 5);
    }

    // Generalized version
    static int multiples(int n, int a, int b) {
        int i = 1;
        int k = 0;

        while (i < n) {
            boolean divisibleBy3 = i % a == 0;
            boolean divisibleBy5 = i % b == 0;

            if (divisibleBy3) {
                k++;
                i++;
            } else if (divisibleBy5) {
                k++;
                i++;
            } else {
                i++;
            }
        }

        System.out.println(k);
        return k;
    }

}


