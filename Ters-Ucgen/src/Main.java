import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz.");
        int n = inp.nextInt();
        int y = n;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * y - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
            y--;
        }
    }
}
//www.patika.dev

