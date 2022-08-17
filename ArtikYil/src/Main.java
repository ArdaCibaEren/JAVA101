import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil, kalan;

        Scanner inp = new Scanner(System.in);

        System.out.println("Yıl bilgisi giriniz.");
        yil = inp.nextInt();
        kalan = yil % 100;

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                System.out.println(yil + " artık yıl degildir.");
            } else {
                System.out.println(yil + " bir artık yıldır.");
            }

        } else if (yil % 400 == 0) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " artık yıl degildir");
        }
    }
}

