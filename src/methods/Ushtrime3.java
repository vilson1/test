package methods;

import java.util.Scanner;

public class Ushtrime3 {
    //krijo nje metode ku te shkruash vitin e lindjes dhe te tregon sa vjec je

    public static void mosha(int vitiILindjes,int vitiAktual){
        int mosha=vitiAktual-vitiILindjes;
        System.out.println("mosha = " + mosha);

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Shkruani vitin aktual");
        int vitiAktual=input.nextInt();
        System.out.println("Shkruani vitin e lindjes");
        int vitiLindjes=input.nextInt();
        mosha(vitiLindjes,vitiAktual);
    }

}
