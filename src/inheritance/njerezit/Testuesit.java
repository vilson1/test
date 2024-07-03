package inheritance.njerezit;

public class Testuesit extends Employees{
    public int numriIBugeve;

    public Testuesit(String emri, String rraca, char gjinia, int mosha, String pozicioniPunes, int ID, int numriIBugeve) {
        super(emri, rraca, gjinia, mosha, pozicioniPunes, ID);
        this.numriIBugeve = numriIBugeve;
    }

    @Override
    public String toString() {
        return "Testuesit{" +
                "pozicioniPunes='" + pozicioniPunes + '\'' +
                ", ID=" + ID +
                ", emri='" + emri + '\'' +
                ", rraca='" + rraca + '\'' +
                ", gjinia=" + gjinia +
                ", mosha=" + mosha +
                ", numriIBugeve=" + numriIBugeve +
                '}';
    }
}
