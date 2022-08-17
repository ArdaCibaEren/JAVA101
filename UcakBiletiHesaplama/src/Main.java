import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double ucret, indirimlifiyat;
        int yas, km, bilet;

        Scanner inp = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz. ");
        km = inp.nextInt();
        System.out.println("Yaşınızı giriniz.");
        yas = inp.nextInt();
        System.out.println("Bilet tipini seçiniz.\n1-Tek yön\n2-Gidiş-dönüş");
        bilet = inp.nextInt();


        ucret = (km * 0.10);
        if (yas < 12) {
            indirimlifiyat = (ucret / 2);
        } else if (yas >= 12 && yas <= 24) {
            indirimlifiyat = ucret - (ucret * 0.10);
        } else if (yas >= 65) {
            indirimlifiyat = ucret - (ucret * 0.30);
        } else {
            indirimlifiyat = ucret;
        }
        if (bilet == 2) {
            indirimlifiyat = indirimlifiyat - (indirimlifiyat * 0.20);
            indirimlifiyat = indirimlifiyat * 2;
        } else if (bilet == 1) {

        } else {
            System.out.println("Bilet tipini hatalı seçtiniz.");
        }

        if (km < 0 || yas < 0) {
            System.out.println("Yaşınızı veya kmyi hatalı girdiniz.");

        } else {
            System.out.println("Toplam : " + indirimlifiyat);
        }

    }
}
