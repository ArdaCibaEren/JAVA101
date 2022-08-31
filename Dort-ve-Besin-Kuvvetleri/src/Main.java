import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int p;

        Scanner inp = new Scanner(System.in);
        System.out.println("Sınır sayısını giriniz.");
        p = inp.nextInt();

        for (int i = 1; i <= p; i *= 4) {
            System.out.println(i);
        }
        for (int i = 1; i <= p; i *= 5) {
            System.out.println(i);
        }
    }
}
