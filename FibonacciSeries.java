package Metal;

class Fab {
    public void series(int n) {

        int a = 0;
        int b = 1;

        if (n == 0) {
            System.out.println(a);
            return;
        }

        System.out.print(a + " " + b + " ");

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

public class FibonacciSeries {

    public static void main(String[] args) {

        Fab fa = new Fab();
        fa.series(5);

    }
}
