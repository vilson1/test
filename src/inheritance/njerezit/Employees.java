package inheritance.njerezit;

public class Employees extends Njerezit{
    public String pozicioniPunes;
    public int ID;

    public Employees(String emri, String rraca, char gjinia, int mosha, String pozicioniPunes, int ID) {
        super(emri, rraca, gjinia, mosha);
        this.pozicioniPunes = pozicioniPunes;
        this.ID = ID;
    }
}
