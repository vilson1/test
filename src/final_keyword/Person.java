package final_keyword;

public class Person {
    public  String ditelindja;
    public  String kombesia;
    public String emri;

    public Person(String ditelindja, String kombesia,String emri) {
        this.ditelindja = ditelindja;
        this.kombesia = kombesia;
        this.emri=emri;
    }

    public final void punoj(){
        System.out.println("une punoj");
    }


}
