import java.util.Scanner;

public class Main {

    static boolean asal(int a, int b) {
        if (a == b)
            return true;

        if (a % b == 0)
            return false;

        return asal(a, b + 1);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int a = inp.nextInt();

        System.out.println(asal(a, 2) ? a + " sayısı asal sayıdır." : a + " sayısı asal sayı değildir.");
    }
}
//www.patika.dev