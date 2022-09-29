import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz : ");
        int n = inp.nextInt();
        int array[] = new int[n];
        System.out.println("Dizinin elemanlarını giriniz : ");

        for (int index = 0; index < n; index++) {
            array[index] = inp.nextInt();
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
//www.patika.dev
