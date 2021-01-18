package jp.ac.uryukyu.ie.e205720;
/**このクラスは置かれた黒駒の周りに白駒がないか調べ、裏返せるなら裏返すクラス 
 * 
 * このクラスはネットに上がっているものを自分のコードに合うように少し変えた引用コードである為、
 * レポートにその説明と引用先を記す
*/
public class BlackGame {
    Board board = new Board();
    /**左上に置かれている駒を確認して白駒が裏返せるなら裏返すメソッド */
    static public void turnLeftUp(int x, int y) {
        if (y > 1 && x > 1) {

            // となりの駒
            String next = Board.board[y - 1][x - 1];

            // となりの駒が裏駒の場合
            if (next.equals(Board.WHITE)) {

                // さらにその一つとなりから順に確認
                for (int i = 2; true; i++) {

                    if (x - i < 0 || y - i < 0 || Board.board[y - i][x - i].equals(Board.EMPTY)) {
                        // 駒がない場合終了
                        break;
                    } else if (Board.board[y - i][x - i].equals(Board.BLACK)) {
                        // 自駒の場合

                        // あいだの駒をすべて自駒にひっくりかえす
                        for (int t = 1; t < i; t++) {
                            // 配列の要素を上書き
                            Board.board[y - t][x - t] = Board.BLACK;
                        }
                        break;
                    }
                }
            }

        }
    }

    /**上に置かれている駒を確認して白駒が裏返せるなら裏返すメソッド */
    static public void turnUp(int x, int y) {
        if (y > 1) {

            // となりの駒
            String next = Board.board[y - 1][x];

            // となりの駒が裏駒の場合
            if (next.equals(Board.WHITE)) {

                // さらにその一つとなりから順に確認
                for (int i = 2; true; i++) {

                    if (y - i < 0 || Board.board[y - i][x].equals(Board.EMPTY)) {
                        // 駒がない場合終了
                        break;
                    } else if (Board.board[y - i][x].equals(Board.BLACK)) {
                        // 自駒の場合

                        // あいだの駒をすべて自駒にひっくりかえす
                        for (int t = 1; t < i; t++) {
                            // 配列の要素を上書き
                            Board.board[y - t][x] = Board.BLACK;
                        }
                        break;
                    }
                }
            }

        }
    }

    /**右上に置かれている駒を確認して白駒が裏返せるなら裏返すメソッド */
    static public void turnRightUp(int x, int y) {
        if (y > 1 && x < 6) {

            // となりの駒
            String next = Board.board[y - 1][x + 1];

            // となりの駒が裏駒の場合
            if (next.equals(Board.WHITE)) {

                // さらにその一つとなりから順に確認
                for (int i = 2; true; i++) {

                    if (x + i > 7 || y - i < 0 || Board.board[y - i][x + i].equals(Board.EMPTY)) {
                        // 駒がない場合終了
                        break;
                    } else if (Board.board[y - i][x + i].equals(Board.BLACK)) {
                        // 自駒の場合

                        // あいだの駒をすべて自駒にひっくりかえす
                        for (int t = 1; t < i; t++) {
                            // 配列の要素を上書き
                            Board.board[y - t][x + t] = Board.BLACK;
                        }
                        break;
                    }
                }
            }

        }
    }

    /**下に置かれている駒を確認して白駒が裏返せるなら裏返すメソッド */
    static public void turnDown(int x, int y) {
        if (y < 6) {

            // となりの駒
            String next = Board.board[y + 1][x];

            // となりの駒が裏駒の場合
            if (next.equals(Board.WHITE)) {

                // さらにその一つとなりから順に確認
                for (int i = 2; true; i++) {

                    if (y + i > 7 || Board.board[y + i][x].equals(Board.EMPTY)) {
                        // 駒がない場合終了
                        break;
                    } else if (Board.board[y + i][x].equals(Board.BLACK)) {
                        // 自駒の場合

                        // あいだの駒をすべて自駒にひっくりかえす
                        for (int t = 1; t < i; t++) {
                            // 配列の要素を上書き
                            Board.board[y + t][x] = Board.BLACK;
                        }
                        break;
                    }
                }
            }

        }
    }

    /**右に置かれている駒を確認して白駒が裏返せるなら裏返すメソッド */
    static public void turnRight(int x, int y) {
        if (x < 6) {

            // となりの駒
            String next = Board.board[y][x + 1];

            // となりの駒が裏駒の場合
            if (next.equals(Board.WHITE)) {

                // さらにその一つとなりから順に確認
                for (int i = 2; true; i++) {

                    if (x + i > 7 || Board.board[y][x + i].equals(Board.EMPTY)) {
                        // 駒がない場合終了
                        break;
                    } else if (Board.board[y][x + i].equals(Board.BLACK)) {
                        // 自駒の場合

                        // あいだの駒をすべて自駒にひっくりかえす
                        for (int t = 1; t < i; t++) {
                            // 配列の要素を上書き
                            Board.board[y][x + t] = Board.BLACK;
                        }
                        break;
                    }
                }
            }

        }
    }

    /**左下に置かれている駒を確認して白駒が裏返せるなら裏返すメソッド */
    static public void turnLeftDown(int x, int y) {
        if (y < 6 && x > 1) {

            // となりの駒
            String next = Board.board[y + 1][x - 1];

            // となりの駒が裏駒の場合
            if (next.equals(Board.WHITE)) {

                // さらにその一つとなりから順に確認
                for (int i = 2; true; i++) {

                    if (x - i < 0 || y + i > 7 || Board.board[y + i][x - i].equals(Board.EMPTY)) {
                        // 駒がない場合終了
                        break;
                    } else if (Board.board[y + i][x - i].equals(Board.BLACK)) {
                        // 自駒の場合

                        // あいだの駒をすべて自駒にひっくりかえす
                        for (int t = 1; t < i; t++) {
                            // 配列の要素を上書き
                            Board.board[y + t][x - t] = Board.BLACK;
                        }
                        break;
                    }
                }
            }

        }
    }

    /**左に置かれている駒を確認して白駒が裏返せるなら裏返すメソッド */
    static public void turnLeft(int x, int y) {
        if (x > 1) {

            // となりの駒
            String next = Board.board[y][x - 1];

            // となりの駒が裏駒の場合
            if (next.equals(Board.WHITE)) {

                // さらにその一つとなりから順に確認
                for (int i = 2; true; i++) {

                    if (x - i < 0 || Board.board[y][x - i].equals(Board.EMPTY)) {
                        // 駒がない場合終了
                        break;
                    } else if (Board.board[y][x - i].equals(Board.BLACK)) {
                        // 自駒の場合

                        // あいだの駒をすべて自駒にひっくりかえす
                        for (int t = 1; t < i; t++) {
                            // 配列の要素を上書き
                            Board.board[y][x - t] = Board.BLACK;
                        }
                        break;
                    }
                }
            }

        }
    }

    /**右下に置かれている駒を確認して白駒が裏返せるなら裏返すメソッド */
    static public void turnRightDown(int x, int y) {
        if (y < 6 && x < 6) {

            // となりの駒
            String next = Board.board[y + 1][x + 1];

            // となりの駒が裏駒の場合
            if (next.equals(Board.WHITE)) {

                // さらにその一つとなりから順に確認
                for (int i = 2; true; i++) {

                    if (x + i > 7 || y + i > 7 || Board.board[y + i][x + i].equals(Board.EMPTY)) {
                        // 駒がない場合終了
                        break;
                    } else if (Board.board[y + i][x + i].equals(Board.BLACK)) {
                        // 自駒の場合

                        // あいだの駒をすべて自駒にひっくりかえす
                        for (int t = 1; t < i; t++) {
                            // 配列の要素を上書き
                            Board.board[y + t][x + t] = Board.BLACK;
                        }
                        break;
                    }
                }
            }

        }
    }

}
