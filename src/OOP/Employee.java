package OOP;

import interfase.animalTask.Cat;

public abstract class Employee {
    private String emri;
    private String mbiemri;
    private int mosha;
    private char gjinia;
    private int iD;
    Cat abc;

    public static class BKTEmployee {
        public String SWIFTCode;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public void setGjinia(char gjinia) {
        this.gjinia = gjinia;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public char getGjinia() {
        return gjinia;
    }

    public int getiD() {
        return iD;
    }

    public int setMosha(int mosha) {
        if (mosha < 0 || mosha > 100) {
            System.exit(-1);
        } else {
            this.mosha = mosha;
        }
        return this.mosha;
    }

    public Employee(String emri, String mbiemri, int mosha, char gjinia) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.mosha = setMosha(mosha);
        this.gjinia = gjinia;
        this.abc=abc;
    }

    public void puno(){
        System.out.println("employee punon");
    }



    @Override
    public String toString() {
        return "Employee{" +
                "emri='" + emri + '\'' +
                ", mbiemri='" + mbiemri + '\'' +
                ", mosha=" + mosha +
                ", gjinia=" + gjinia +
                ", iD=" + iD +
                '}';
    }

}
