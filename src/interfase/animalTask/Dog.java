package interfase.animalTask;

public class Dog extends Animals implements Shtepiake{
    public Dog() {
    }

    @Override
    public void eat(){
        System.out.println("eat Dog food");
    }

    public void leh(){
        System.out.println("qeni leh");
    }

    @Override
    public void isMiqsore(){
        System.out.println("qeni eshte nje kafshe miqesore");
    }
}
