package costom_class;

public class Dog {
    public String emri;
    public int mosha;
    public char gjinia;
    public String ngjyra;

    public void qeniHa(){
        System.out.println("qeni ha!");
    }
    public void  qeniFle(){
        System.out.println("qeni fle");
    }

    public String toString() {
        return "Dog{" +
                "emri='" + emri + '\'' +
                ", mosha=" + mosha +
                ", gjinia=" + gjinia +
                ", ngjyra='" + ngjyra + '\'' +
                '}';
    }


}
