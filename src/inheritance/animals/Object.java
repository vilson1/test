package inheritance.animals;

import final_keyword.ProtectedAccessModifier;

public class Object {
    public static void main(String[] args) {
        Qeni qeni=new Qeni("Gofi","pitbull","kaf",'M',3,15);
        qeni.ha();
        qeni.fle();
        qeni.leh();
        qeni.leviz();
        System.out.println(qeni);

        Macja macja=new Macja("pisika","mace siriane","e bardhe",'F',5,10);
        macja.ha();
        macja.fle();
        macja.mjaullin();
        macja.leviz();
        System.out.println(macja);
    }
}
