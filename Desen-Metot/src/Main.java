import java.util.Scanner;

public class Main {
    static void desen(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            desen(n - 5);
        }
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir değer giriniz : ");
        int n = inp.nextInt();
        desen(n);
        System.out.println();
    }
}
//www.patika.dev