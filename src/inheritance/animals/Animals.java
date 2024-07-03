package inheritance.animals;

import final_keyword.ProtectedAccessModifier;

public class Animals{
   public String emri, rraca, ngjyra;
   public char gjinia;
   public int mosha, pesha;

    public Animals(String emri, String rraca, String ngjyra, char gjinia, int mosha, int pesha) {
        this.emri = emri;
        this.rraca = rraca;
        this.ngjyra = ngjyra;
        this.gjinia = gjinia;
        this.mosha = mosha;
        this.pesha = pesha;
    }

    public void ha(){
       System.out.println(emri+ "Ha");
   }
   public void fle(){
       System.out.println(emri+" fle");
   }
   public void leviz(){
       System.out.println(emri+" leviz");
   }



    public String toString() {
        return "Animals{" +
                "emri='" + emri + '\'' +
                ", rraca='" + rraca + '\'' +
                ", ngjyra='" + ngjyra + '\'' +
                ", gjinia=" + gjinia +
                ", mosha=" + mosha +
                ", pesha=" + pesha +
                '}';
    }
}

