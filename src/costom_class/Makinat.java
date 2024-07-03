package costom_class;

public class Makinat {
    //krijoni nje klase me emrin makinat
    // variabla do te jene : modeli,viti prodhimit, km, ngjyra, karburanti
    // metodat do te jene : eShpejte , konsumi, komforti,

    public String modeli;
    public int vitiProdhimit;
    public int kilometrat;
    public String ngjyra;
    public String karburanti;

    public void eShpejte(){
        System.out.println("Shpejtesia");
    }
    public void konsumi(){
        System.out.println("makina konsumon shume");
    }

    public void komforti(){
        System.out.println("MAkina eshte e rehatshme");
    }

    @Override
    public String toString() {
        return "Makinat{" +
                "modeli='" + modeli + '\'' +
                ", vitiProdhimit=" + vitiProdhimit +
                ", kilometrat=" + kilometrat +
                ", ngjyra='" + ngjyra + '\'' +
                ", karburanti='" + karburanti + '\'' +
                '}';
    }

    public void setInfo(String modeliMakines, int vitiProdhimitMakines,int kilometratEMakines,String ngjyraEMakines,String karnurantiMakines){
        modeli=modeliMakines;
        vitiProdhimit=vitiProdhimitMakines;
        kilometrat=kilometratEMakines;
        ngjyra=ngjyraEMakines;
        karburanti=karnurantiMakines;
    }
}
