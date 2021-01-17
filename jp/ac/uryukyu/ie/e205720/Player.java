package jp.ac.uryukyu.ie.e205720;
import java.util.Scanner;

public class Player {

    public void input() {   //入力を受け取る
        Scanner scanner = new Scanner(System.in);
        System.out.print("何行？");
        int val = scanner.nextInt();
        System.out.print("何列？");
        int num = scanner.nextInt();
        System.out.println(val+"行"+num+"列");
    }
}
