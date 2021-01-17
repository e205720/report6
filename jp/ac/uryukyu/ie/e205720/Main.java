package jp.ac.uryukyu.ie.e205720;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Board board = new Board();
            Player player = new Player();
            Game game = new Game();
            board.FarstBoard();
            board.set();
            player.input();
            game.judge();
            if(game.judge()){
            }else{
                System.out.println("ゲーム終了");
            }
        }
    }
}