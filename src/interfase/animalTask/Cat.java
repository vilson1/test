package interfase.animalTask;

public class Cat extends Animals implements Shtepiake{
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating cat food");
    }
    public void mjaullin(){
        System.out.println("macja mjaullin");
    }

    @Override
    public void isMiqsore(){
        System.out.println("macja eshte nje kafshe miqesore");
    }
}
