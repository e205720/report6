package jp.ac.uryukyu.ie.e205720;

public class GameMaster {
    Main main = new Main();

    public boolean check() {

        if (Main.count % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
}

