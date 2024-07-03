package exceptions_2;

public class CostomExceptions extends RuntimeException{

    public static void pauseExxeption(String mesazhi){
        throw new RuntimeException(mesazhi);
    }

}
