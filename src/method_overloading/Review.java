package method_overloading;

public class Review {
    public static void sum(int num1,int num2){
        //return  num1+num2;
    }

    public static int sum(){
        return  5;
    }

    public static int sum(int num1){
        return  num1;
    }



    public static String sum(String str,int str1 ){
        return str;
    }

    public static boolean sum(boolean str,boolean str1 ){
        return str1;
    }

    public static void main(String[] args) {
        sum("abc",1);
    }




}
