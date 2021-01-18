package jp.ac.uryukyu.ie.e205720;

import java.util.Arrays;

public class Board {

    static final String BLACK = "⚫️";
    static final String WHITE = "⚪️";
    static final String EMPTY = "　";

    

    public static String[][] board = new String[8][8];

    public void FarstBoard() { // 初期設定
        for (int i = 0; i < 8; i++) {
            for (int x = 0; x < 8; x++) {
                board[i][x] = EMPTY;
            }
        }
        board[3][4] = WHITE;
        board[4][3] = WHITE;
        board[4][4] = BLACK;
        board[3][3] = BLACK;

        

    }

    public String[][] getStrings() {
        return board;
    }

    public void set() { // 盤面を表示
        System.out.println(" [ 0][ 1][ 2][ 3][ 4][ 5][ 6][ 7]");
        int num = 0;
        for (String[] setboard : board) {
            System.out.print(num);
            System.out.println(Arrays.toString(setboard));
            num++;
        }
    }

    public void WhiteChenge(int x, int y) {
        WhiteGame game = new WhiteGame();
        board[y][x] = WHITE;

        WhiteGame.turnLeftUp(x, y);
        WhiteGame.turnUp(x, y);
        WhiteGame.turnRightUp(x, y);
        WhiteGame.turnLeft(x, y);
        WhiteGame.turnRight(x, y);
        WhiteGame.turnLeftDown(x, y);
        WhiteGame.turnDown(x, y);
        WhiteGame.turnRightDown(x, y);
    }

    public void BlackChenge(int x, int y) {
        BlackGame game = new BlackGame();
        board[y][x] = BLACK;

        BlackGame.turnLeftUp(x, y);
        BlackGame.turnUp(x, y);
        BlackGame.turnRightUp(x, y);
        BlackGame.turnLeft(x, y);
        BlackGame.turnRight(x, y);
        BlackGame.turnLeftDown(x, y);
        BlackGame.turnDown(x, y);
        BlackGame.turnRightDown(x, y);


    }

    public boolean judge() {
        int count = 0;
        for (String[] setboard : board) {
            for (String list : setboard) {
                if ("　".equals(list)) {
                    count++;
                }
            }
        }
        if (count >= 1) {
            return true;
        } else {
            return false;
        }
    }
}
