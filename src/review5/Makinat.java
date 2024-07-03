package review5;
public class Makinat {

   public String ngjyra;
   public int vitiProdhimit;

   public Makinat(){
   }

    public Makinat(String ngjyra, int vitiProdhimit) {
        this.ngjyra = ngjyra;
        this.vitiProdhimit = vitiProdhimit;
    }

    @Override
    public String toString() {
        return "Makinat{" +
                "ngjyra='" + ngjyra + '\'' +
                ", vitiProdhimit=" + vitiProdhimit +
                '}';
    }
}
