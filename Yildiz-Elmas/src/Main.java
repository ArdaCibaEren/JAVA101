import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz.");
        int n = inp.nextInt();
        int x = n, say = 0;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
                say = j;
            }
            System.out.println();
        }
        for (int i = 1; i <= x; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (say - (2 * i)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//www.patika.dev
