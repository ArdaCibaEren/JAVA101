import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Dizinin satırını giriniz : ");
        int row = inp.nextInt();
        System.out.println("Dizinin sütununu giriniz : ");
        int column = inp.nextInt();

        int arr[][] = new int[row][column];
        int arr2[][] = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(i + ". satırın " + j + ". elemanını giriniz: ");
                arr[i][j] = inp.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr2[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
//www.patika.dev