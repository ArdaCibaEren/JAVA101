import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı giriniz.");
        int number = inp.nextInt();
        int basSayisi = 0, result = 0;
        while (number != 0) {
            result = (number % 10) + result;
            number /= 10;
            ++basSayisi;
        }
        System.out.println(result);
    }
}

//www.patika.dev