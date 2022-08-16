import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y, z, sonuc;

        Scanner inp = new Scanner(System.in);

        System.out.println("1.sayı: ");
        x = inp.nextInt();
        System.out.println("2.sayı: ");
        y = inp.nextInt();
        System.out.println("3.sayı: ");
        z = inp.nextInt();

        if ((x < y) && (x < z)) {
            if (y < z) {
                System.out.println("x<y<z");
            } else {
                System.out.println("x<z<y");
            }
        } else if ((y < x) && (y < z)) {
            if (x < z) {
                System.out.println("y<x<z");
            } else {
                System.out.println("y<z<x");
            }
        } else {
            if (x < y) {
                System.out.println("z<x<y");
            } else {
                System.out.println("z<y<x");
            }
        }
    }
}
