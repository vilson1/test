package constructors;

public class Picat {
    public static void main(String[] args) {
        Piceri picaOrnel=new Piceri('L',2,1);
        Piceri picaArti=new Piceri('M',5,5);
        Piceri picaVilson=new Piceri('L',1,1);
        Piceri picaRezi=new Piceri('S',1,2);
        System.out.println(picaOrnel);
        picaOrnel.shtoDjathe(7);
        System.out.println(picaArti);
        System.out.println(picaOrnel);
        System.out.println(picaRezi);
        System.out.println(picaVilson);
        System.out.println("---------------");
        System.out.println(picaOrnel.cmimi());
        System.out.println(picaArti.cmimi());
        System.out.println(picaRezi.cmimi());
        System.out.println(picaVilson.cmimi());

    }
}
