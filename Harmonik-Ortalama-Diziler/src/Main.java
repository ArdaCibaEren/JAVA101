public class Main {
    public static void main(String[] args) {
        int[] list = {34, 55, 67, 44, 200, 55, 84};
        double sum = 0.0;
        for (int i = 0; i < list.length; i++) {
            sum += (1.0 / list[i]);

        }
        double result = list.length / sum;
        System.out.println(result);
    }
}
//www.patika.dev