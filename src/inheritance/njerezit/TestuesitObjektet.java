package inheritance.njerezit;

import inheritance.animals.Luani;
import inheritance.animals.Qeni;

public class TestuesitObjektet {
    public static void main(String[] args) {
        Qeni qeni=new Qeni("Gofi","pitbull","kaf",'M',3,15);
        Njerezit njeriu1=new Njerezit("abc","Europian",'M',20);
        Employees employees=new Employees("abc","Europian",'M',25,"zhvillues",12345678);
        Testuesit testuesit =new Testuesit("abc","Europian",'M',30,"testues",12345678,200);
        System.out.println(testuesit);
    }
}
