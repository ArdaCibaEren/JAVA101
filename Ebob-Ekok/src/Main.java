import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = inp.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        int n2 = inp.nextInt();
        int ebob = 1, i = n1 + n2;
        int k = 1, ekok = 1;

        while (k == 1) {
            if (n1 % i == 0 && n2 % i == 0) {
                k = 2;
                System.out.println("EBOB eşittir : " + i);
                ekok = ((n1 * n2) / i);
                System.out.println("EKOK eşittir : " + ekok);
            }
            i--;
        }
    }
}

//www.patika.dev