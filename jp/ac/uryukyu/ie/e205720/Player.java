package jp.ac.uryukyu.ie.e205720;

import java.util.Scanner;

/**プレイヤーの入力をさせて読み取るクラス */
public class Player {
    Board board = new Board();
    GameMaster gameMaster = new GameMaster();

    /**プレイヤーからの入力を受け取り、他のメソッドに入力値を知らせるメソッド */
    public void input() { 
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
