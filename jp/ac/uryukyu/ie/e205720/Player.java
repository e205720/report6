package jp.ac.uryukyu.ie.e205720;

import java.util.Scanner;

public class Player {
    Board board = new Board();
    GameMaster gameMaster = new GameMaster();

    public void input() { // 入力を受け取る
        Scanner scanner = new Scanner(System.in);
        System.out.print("何列？");
        int x = scanner.nextInt();
        System.out.print("何行？");
        int y = scanner.nextInt();
        System.out.println(x + "列" + y + "行");
        if (Board.board[x][y].equals(Board.EMPTY)) {
            if (gameMaster.check()) {
                board.WhiteChenge(x, y);
            } else {
                board.BlackChenge(x, y);
            }
        }else{
            System.out.println("そのマスは埋まっています");
            
        }
    }

}
