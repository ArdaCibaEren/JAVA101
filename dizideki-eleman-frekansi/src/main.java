import java.util.Arrays;

public class main {
    static boolean ign(int[] arr, int value, int a) {
        for (int i = 0; i < a; i++) {
            if (value == arr[i]) {
                return false;
            }
        }
        return true;
    }

    static int equalCount(int[] arr, int value) {
        int count = 0;
        for (int i : arr) {
            if (i == value)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 0, 20, 10, 0};
        System.out.println("Dizi : " + Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            if (ign(list, list[i], i)) {
                System.out.println(list[i] + " sayısı " + equalCount(list, list[i]) + " kez tekrar edildi.");
            }
        }
    }
}
//www.patika.dev