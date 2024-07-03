package exceptions_2;

import java.util.Scanner;

public class WormUp {
    public static void main(String[] args) throws InterruptedException {
        //Morning wormup
        // 30 pushups  1.5 sekonda pushim
        // 20 pullups  1 sekonda pushim

        for (int i = 1; i <= 30; i++) {
            System.out.print("\rPush Up "+i);
           sleep(1.5);
        }

        for (int i = 1; i <= 20; i++) {
            System.out.print("\rPull Up "+i);
            sleep(1);
        }
        Scanner scanner=new Scanner(System.in);
    }

    public static void sleep(double timeInSeconds) throws InterruptedException{
            Thread.sleep((long)(timeInSeconds*1000));
    }
}
