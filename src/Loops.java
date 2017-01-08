
public class Loops {

    public static void main(String args[]) {

    }

    public void printNumbers() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void printNumbers2() {
        while (i < 11) {
            System.out.println(i);
        }
    }

    public void printNumbers3(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }

    public void printNumbers4(int n) {
        for (int i = 0; i <= n; i++) {
            if (n % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void printSum() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                sum = sum + j;
            }
            System.out.println(sum);
            sum = 0;
        }

    }
    public void printSum2() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= i; j++) {
                sum = sum + j;
            }
            System.out.println(sum);
            sum = 0;
        }

    }

}
