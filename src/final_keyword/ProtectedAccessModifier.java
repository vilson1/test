package final_keyword;

public class ProtectedAccessModifier {
    private  int mosha;
      char gjinia;
     static String emri;
     protected static String mbiemri;
    /*
    - public --> perdoret kudo ne projekt
    -private --> aksesohet vetem brenda klases
    - default --> aksesohet vetem brenda paketes
    -protected -->nese klasa eshet jasht paketes duhet te jete subclass ose klasat te jene ne te njejten pakete

    public --> protected  --> default --> private
     */

    public ProtectedAccessModifier(int mosha) {
        this.mosha = mosha;
    }
    public ProtectedAccessModifier(int mosha,char gjinia) {
        this.mosha = mosha;
        this.gjinia=gjinia;
    }

    public static int mbledhja(int numri1, int numri2){
        return numri1+numri2;
    }
}
