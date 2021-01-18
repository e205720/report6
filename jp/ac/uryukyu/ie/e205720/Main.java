package jp.ac.uryukyu.ie.e205720;

public class Main {
    static int count = 0;

    public static void main(String[] args) {
        Board board = new Board();
        Player player = new Player();
        board.FarstBoard();
        board.set();
        System.out.println("先行は白です");
        while (true) {
            player.input();
            board.set();
            if (board.judge()) {
                System.out.println("次のターン");
            } else {
                System.out.println("ゲーム終了");
                // break;
            }
            count++;
        }
    }
}