package inheritance.animals;

public class Luani extends Animals {
    public int numriIKembeve;
    public Luani(String emri, String rraca, String ngjyra, char gjinia, int mosha, int pesha,int numriIKembeve) {
        super(emri, rraca, ngjyra, gjinia, mosha, pesha);
        this.numriIKembeve=numriIKembeve;
    }

    public void ulerin(){
        System.out.println(emri+" ulerin");
    }

    //
}
