package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples(1000, 3, 5);
        System.out.println(count);
    }

    static int multiples(int n, int a, int b) {

        int i = 1;
        int k = 0;

        while(i < n) {
            boolean divisibleBy3 = i % a == 0;
            boolean divisibleBy5 = i % b == 0;

            if(divisibleBy3){
                k++;
                i++;
            } else if(divisibleBy5){
                k++;
                i++;
            } else{
                i++;
            }

        }
        System.out.println(k);
        return k;
    }
}
