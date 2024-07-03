package exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {

        int a=10;
        int b=0;
        try {
            System.out.println("Try block start");
            System.out.println(a/b);
            System.out.println("try block end");
        }catch (ArithmeticException sandri){
            //sandri.printStackTrace();
            System.out.println(sandri.getMessage());
        }
        System.out.println("Run End");

        try {
            System.out.println("HEllo");
            Thread.sleep(5000);
            System.out.println("Une quhem Vilson");
        }catch (InterruptedException e){
            System.out.println("Interupted Exception handeled");
        }
    }
}
