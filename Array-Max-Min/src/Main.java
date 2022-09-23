import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int minNumber = list[0];
        int maxNumber = list[0];

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = inp.nextInt();

        Arrays.sort(list);
        for (int n : list) {
            if (n < number) {
                minNumber = n;
            }
            if (n > number) {
                maxNumber = n;
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + minNumber);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + maxNumber);
    }
}
//www.patika.dev

