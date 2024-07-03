package day9;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
//Merr apo jo kredi.  duhet te jesh i punesuar, duhet te kesh nje page mbi 700 euro,
// duhet te kesh shtepi per kolateral, mosha max mbi 70 vjec, mbi 1 vit pune. kompania ku punon

        Scanner input= new Scanner(System.in);
        String emri;
        int mosha;
        String kompania;
        boolean punesimi;
        double paga;
        boolean kolaterali;
        int eksperienca;
        System.out.println("Si eshte emri juaj?");
        emri=input.nextLine();
        System.out.println("emri = " + emri);
        System.out.println("Sa eshte mosha?");
        mosha=input.nextInt();
        System.out.println("Jeni i punesuar?");
        punesimi=input.nextBoolean();
        System.out.println("Sa eshte paga juaj?");
        paga=input.nextDouble();
        System.out.println("Keni kolateral?");
        kolaterali=input.nextBoolean();
        System.out.println("Sa vite eksperience keni?");
        eksperienca=input.nextInt();
        if (punesimi && kolaterali){
            if (paga>=700){
                if (eksperienca>1 && mosha <=70){
                    System.out.println("Ju mund te merrni kredi");
                }else{
                    System.out.println("Ju mund te merrni kredi");
                }
            }else {
                System.out.println("Ju nuk mund te merrni kredi");
            }
        }else {
            System.out.println("Ju nuk mund te merrni kredi");
        }
        input.close();




    }
}
