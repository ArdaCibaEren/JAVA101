import java.util.Scanner;

public class Main {
    static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int a = inp.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int b = inp.nextInt();
        System.out.println("Sonuç = " + power(a, b));
    }
}
//www.patika.dev