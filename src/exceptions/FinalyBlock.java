package exceptions;

public class FinalyBlock {
    public static void main(String[] args) {
        int[] arr={1,2,3};

        try {
            System.out.println(arr[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }finally {
            System.out.println("Finally block");
        }
    }

    // final     finally   finalise
    // final -> keyword qw ben klasat metodat dhe variablat te pa ndryshueshme
    //  finally -> eshte nje bllok kodi qe ekzekutohet gjithmone pas try and catch blocks
    //  finalise -> eshte nje metode e garbage collector qe fshin objektet qe jane null
}
