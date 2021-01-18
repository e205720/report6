package jp.ac.uryukyu.ie.e205720;

import java.util.Arrays;
/**オセロの盤面を指示通り展開、運営するクラス */
public class Board {

    static final String BLACK = "⚫️";
    static final String WHITE = "⚪️";
    static final String EMPTY = "　";

    

    public static String[][] board = new String[8][8];
    /**オセロは、最初に真ん中に白と黒の駒を二つずつおくので、初期設定として一回だけ動かすメソッド*/
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

    /**String[][] boardに保存した盤面を目に見えるように表示してくれるメソッド */
    public void set() { // 盤面を表示
        System.out.println(" [ 0][ 1][ 2][ 3][ 4][ 5][ 6][ 7]");
        int num = 0;
        for (String[] setboard : board) {
            System.out.print(num);
            System.out.println(Arrays.toString(setboard));
            num++;
        }
    }
    /**「白駒が置かれ、それによってひっくり返す駒を検索し、あればひっくり返す」を命令するメソッド 。また、
     * 白駒をおくメソッドとしても担っている。
    */
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

    /**「黒駒が置かれ、それによってひっくり返す駒を検索し、あればひっくり返す」を命令するメソッド 。また、
     * 黒駒をおくメソッドとしても担っている。
    */
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
    /**オセロは盤面が埋まれば終了なので、盤面に空白(" ")がないか検索し、
     * 空白があればMainクラスの方に続行を促すメソッド*/
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
    /**白駒の数を数えるメソッド */
    public int WhiteCount(){
        int WhiteCount = 0;
        for (String[] setboard : board) {
            for (String list : setboard) {
                if ("⚪️".equals(list)) {
                    WhiteCount++;
                }
            }
        }
        return WhiteCount;
    }
    /**黒駒の数を数えるメソッド */
    public int BlackCount(){
        int BlackCount = 0;
        for (String[] setboard : board) {
            for (String list : setboard) {
                if ("⚫️".equals(list)) {
                    BlackCount++;
                }
            }
        }
        return BlackCount;
    }
}
