import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1 = 0, n2 = 1, n3, a, n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Eleman sayısı giriniz :");
        n = inp.nextInt();
        System.out.print(n1 + " " + n2);
        for (a = 2; a < n; a++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}
//www.patika.dev

