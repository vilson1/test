package inheritance.celular;

public class CelularObjektet {
    public static void main(String[] args) {
        IPhone iPhone=new IPhone();
        iPhone.setInfo("iPhone","14 Pro Max","i bardhe",6.5,1500);
        iPhone.faceTime(1234567890);
        iPhone.faceTime("abc@abc.com");
        iPhone.text();
        iPhone.call();
        System.out.println(iPhone);
    }
}
