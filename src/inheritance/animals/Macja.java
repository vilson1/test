package inheritance.animals;

public class Macja extends Animals{

    public Macja(String emri, String rraca, String ngjyra, char gjinia, int mosha, int pesha){
        super(emri,rraca,ngjyra,gjinia,mosha,pesha);
    }

    public void mjaullin(){
        System.out.println(emri+" mjaullin");
    }
}
