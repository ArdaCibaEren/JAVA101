import java.util.ArrayList;
import java.util.Random;

public class MineSweeper {
    public static String[][] boardmaker(int row, int column) {
        String[][] board = new String[row][column];
        for (int i = 0; i <= row - 1; i++) {
            for (int j = 0; j <= column - 1; j++) {
                board[i][j] = "-";
            }
        }
        return board;
    }

    public static String[][] miner(int row, int column) {
        String[][] mine_board = new String[row][column];
        for (int i = 0; i <= row - 1; i++) {
            for (int j = 0; j <= column - 1; j++) {
                mine_board[i][j] = "-";
            }
        }
        int mines = (row * column) / 4;
        Random rand = new Random();
        for (int x = 0; x <= mines; x++) {
            int a = rand.nextInt(row - 1);
            int b = rand.nextInt(column - 1);
            if (mine_board[a][b] == "*") {
                mine_board[rand.nextInt(row - 1)][rand.nextInt(column - 1)] = "*";
            } else {
                mine_board[a][b] = "*";
            }
        }
        return mine_board;
    }
}
//www.patika.dev