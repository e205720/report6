package jp.ac.uryukyu.ie.e205720;

/**他のクラスやメソッドを動かし実行させるだけのクラス */
public class Main {
    static int count = 0;

    /**初期設定した後にwhile文でループさせて中のif文のjudge()がfalseになるとループを
     * 抜けるメソッド
     */
    public static void main(String[] args) {
        GameMaster gameMaster = new GameMaster();
        Board board = new Board();
        Player player = new Player();
        board.FarstBoard();
        board.set();
        System.out.println("先行は白です");
        while (true) {
            player.input();
            board.set();
            if (gameMaster.check()){
                System.out.println("黒のターン");
            }else{
                System.out.println("白のターン");
            }
            if (board.judge()) {
            } else {
                gameMaster.winner(board.WhiteCount(), board.BlackCount());
                System.out.println("ゲーム終了");
                break;
            }
            count++;
        }
    }
}