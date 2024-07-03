package inheritance.animals;

public class Qeni extends Animals{

    public Qeni(String emri, String rraca, String ngjyra, char gjinia, int mosha, int pesha) {
        super(emri, rraca, ngjyra, gjinia, mosha, pesha);
    }

    public void leh(){
        System.out.println(emri+" leh");
    }
}
