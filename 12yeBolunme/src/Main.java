import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, i = 1, ortalama = 0, sayisay = 0;

        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı giriniz.");
        k = inp.nextInt();

        if (k < 12) {
            System.out.println("Hatalı giriş yaptınız, tekrar deneyin.");
        } else {
            while (i <= k) {

                if (i % 12 == 0) {
                    ortalama += i;
                    sayisay++;

                }
                i++;
            }
            System.out.println(ortalama / sayisay);
        }
    }
}
