package jp.ac.uryukyu.ie.e205720;

public class Board {

    String BLACK = "⚫️";
    String WHITE = "⚪️";
    String EMPTY = "　";

    public void FarstBoard() {
        System.out.println("[0][1][2][3][4][5][6][7]");
        for (int i=0; i<8; i++){
            //System.out.printf("[%s][%s][%s][%s][%s][%s][%s][%s]%n",EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY);
            if( i == 3){
                System.out.printf("[%s][%s][%s][%s][%s][%s][%s][%s]%n",EMPTY,EMPTY,EMPTY,BLACK,WHITE,EMPTY,EMPTY,EMPTY);
            }else if( i == 4){
                System.out.printf("[%s][%s][%s][%s][%s][%s][%s][%s]%n",EMPTY,EMPTY,EMPTY,WHITE,BLACK,EMPTY,EMPTY,EMPTY);
            }else{{System.out.printf("[%s][%s][%s][%s][%s][%s][%s][%s]%n",EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY,EMPTY);}}
        }
    }
}

