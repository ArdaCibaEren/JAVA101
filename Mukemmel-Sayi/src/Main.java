import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz. ");
        int n = inp.nextInt(), total = 0;

        for (int i = 1; i < n; i++)
            if (n % i == 0) {
                total += i;
            }
        if (n == total) {
            System.out.println(n + " mükemmel bir sayıdır.");
        } else {
            System.out.println(n + " mükemmel bir sayı değildir.");
        }
    }
}
//www.patika.dev