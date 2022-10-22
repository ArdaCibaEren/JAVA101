import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Mayın tarlası oyununa hoşgeldiniz!");
        System.out.print("Toplam satır sayısını giriniz : ");
        int row = inp.nextInt();
        System.out.print("Toplam sütun sayısını giriniz : ");
        int column = inp.nextInt();

        String[][] board = MineSweeper.boardmaker(row, column);
        String[][] mine_board = MineSweeper.miner(row, column);
        for (String[] row1 : board) {
            for (String col1 : row1) {
                System.out.print(col1);
            }
            System.out.println();
        }
        System.out.println("\n");

        int a = 1, counter = 0;
        while (a > 0) {
            System.out.println("Satır giriniz : ");
            int selectRow = inp.nextInt();
            System.out.println("Sütun giriniz : ");
            int selectColumn = inp.nextInt();
            selectRow--;
            selectColumn--;

            if (selectRow >= 0 && selectColumn >= 0 && selectRow < mine_board.length && selectColumn < mine_board[0].length) {
                if (mine_board[selectRow][selectColumn] == "*") {
                    for (String[] row1 : mine_board) {
                        for (String col1 : row1) {
                            System.out.print(col1);
                        }
                        System.out.println();
                    }
                    System.out.println("Mayına bastınız, oyun bitti!");
                    a = -1;
                } else {
                    for (int z = selectRow - 1; z <= selectRow + 1; z++) {
                        for (int w = selectColumn - 1; w <= selectColumn + 1; w++) {
                            if (z >= 0 && w >= 0 && z < mine_board.length - 1 && w < mine_board[0].length - 1) {
                                if (mine_board[z][w] == "*") {
                                    counter++;
                                }
                            }
                        }
                    }
                    board[selectRow][selectColumn] = String.valueOf(counter);
                    counter = 0;
                    int counter2 = 0;
                    for (int i = 0; i <= row - 1; i++) {
                        for (int j = 0; j <= column - 1; j++) {
                            if (mine_board[i][j] == board[i][j]) {
                                counter2++;
                            }
                        }
                    }
                    if (counter2 == 0) {
                        System.out.println("Tebrikler, oyunu kazandınız!");
                        a = -1;
                    }
                    for (String[] row1 : board) {
                        for (String col1 : row1) {
                            System.out.print(col1);
                        }
                        System.out.println();
                    }
                    System.out.println("\n============================\n");
                }
            } else {
                System.out.println("Yanlış değer girdiniz, tekrar deneyin.\n");
            }
        }
    }
}
//www.patika.dev