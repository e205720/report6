package jp.ac.uryukyu.ie.e205720;
/**ゲーム進行を運営しているクラス */
public class GameMaster {
    Main main = new Main();
    /**先行は白駒から始まり後攻黒駒になるように指揮するメソッド */
    public boolean check() {

        if (Main.count % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    /**勝敗を決めるメソッド */
    public static void winner(int white, int black) {
        if(white > black){
            System.out.print("白の勝ち");
        }else if(white == black){
            System.out.println("引き分け");
        }else{
            System.out.println("黒の勝ち");
        }
    }
}

