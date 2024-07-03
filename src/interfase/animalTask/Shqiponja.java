package interfase.animalTask;

public class Shqiponja extends Animals implements Fluturon{
    public Shqiponja() {
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating eagle food");
    }

    @Override
    public void fluturon(){
        System.out.println("Shqiponja fluturon");
    }
}
