package jp.ac.uryukyu.ie.e205720;
import java.util.Arrays;

public class Board {

    String BLACK = "⚫️";
    String WHITE = "⚪️";
    String EMPTY = "　";

    String[][] board = new String[8][8];

    public void FarstBoard() {      //初期設定
        for (int i = 0; i < 8; i++) {
            for (int x = 0; x < 8; x++) {
                board[i][x] = EMPTY;
            }
            board[3][4] = WHITE;
            board[4][3] = WHITE;
            board[4][4] = BLACK;
            board[3][3] = BLACK;
        }
    }

    public void set() {     //盤面を表示
        System.out.println("[ 1][ 2][ 3][ 4][ 5][ 6][ 7][ 8]");
        for (String[] setboard : board) {
            System.out.println(Arrays.toString(setboard));
        }


        /*
         * if (i == 4) { System.out.printf("[ %d][%s][%s][%s][%s][%s][%s][%s][%s]%n", i,
         * EMPTY, EMPTY, EMPTY, BLACK, WHITE, EMPTY, EMPTY, EMPTY); } else if (i == 5) {
         * System.out.printf("[ %d][%s][%s][%s][%s][%s][%s][%s][%s]%n", i, EMPTY, EMPTY,
         * EMPTY, WHITE, BLACK, EMPTY, EMPTY, EMPTY); } else { {
         * System.out.printf("[ %d][%s][%s][%s][%s][%s][%s][%s][%s]%n", i, EMPTY, EMPTY,
         * EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY); } }
         */
    }

}
