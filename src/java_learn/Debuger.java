package java_learn;

public class Debuger {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                count++;
                System.out.println(i);

            }

            if (count == 5) {
                break;
            }
        }
        System.out.println(sum);
    }
}
