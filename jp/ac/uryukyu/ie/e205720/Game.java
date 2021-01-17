package jp.ac.uryukyu.ie.e205720;

import java.util.Arrays;

public class Game {
    Board board = new Board();

    public boolean judge() {
        if (Arrays.asList(board).contains(" ")) {
            System.out.println("次のターン");
            return true;
        } else {
            return false;
        }
    }
}
