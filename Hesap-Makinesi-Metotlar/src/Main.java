import java.util.Scanner;

public class Main {
    static void plus() {
        Scanner inp = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı : ");
            number = inp.nextInt();
            if (number == 0 || i == 6) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç = " + result);
    }

    static void minus() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = inp.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = inp.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç = " + result);
    }

    static void times() {
        Scanner inp = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı = ");
            number = inp.nextInt();

            if (number == 1 || i == 6)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç = " + result);
    }

    static void divided() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz? ");
        int counter = inp.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı : ");
            number = inp.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Bölen 0 olamaz.");
                continue;
            }
            if (i == 1) {
                result /= number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç = " + result);
    }

    static void power() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int base = inp.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int exp = inp.nextInt();
        int result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println("Sonuç = " + result);
    }

    static void factorial() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int n = inp.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Sonuç = " + result);
    }

    static void mod() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci sayı : ");
        int a = inp.nextInt();
        System.out.print("İkinci sayı : ");
        int b = inp.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("0 hatası, başka bir sayı girin.");
        } else {
            int result = a % b;
            System.out.println("Sonuç = " + result);
        }
    }

    static void calc() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci kenarın uzunluğunu girin : ");
        int a = inp.nextInt();
        System.out.print("İkinci kenarın uzunluğunu girin : ");
        int b = inp.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("0 hatası, başka bir sayı girin.");
        } else {
            int cevre = 2 * (a + b);
            int alan = (a * b);
            System.out.println("Dikdörtgenin çevresi = " + cevre);
            System.out.println("Dikdörtgenin alanı = " + alan);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz : ");
            select = inp.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    calc();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyin.");
            }
        } while (select != 0);
        System.out.println("Hoşçakalın.");
    }
}
//www.patika.dev