package inheritance.celular;

public class IPhone extends Celular {
 /*   1.2 Create a sub class of Phone named IPhone:
    Variables:
    brand, model, size, price, color

    Methods:
    setInfo()
    call(long phoneNumber)
    text(long phoneNumber)
    faceTime(long phoneNumber)
    faceTime(String email)
    toString()*/

    public void faceTime(long phoneNumer){
        System.out.println("face time with "+phoneNumer);
    }

    public void faceTime(String email){
        System.out.println("face time with "+email);
    }


}
