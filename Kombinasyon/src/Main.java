import java.util.Scanner;

public class Main {
    static int factorial(int n) {
        int toplam = 1;

        while (n > 0) {
            toplam *= n;
            n--;
        }
        return (toplam);
    }

    public static void main(String[] args) {
        int c = 1;
        Scanner inp = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz.");
        int n = inp.nextInt();
        System.out.println("2.sayıyı giriniz.");
        int r = inp.nextInt();

        c = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println(c);
    }
}