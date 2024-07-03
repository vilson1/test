package interfase.animalTask;

public class Papagalli extends Animals implements Fluturon,Shtepiake{
    public Papagalli() {
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating parrot food");
    }

   @Override
   public void fluturon(){
       System.out.println("papagalli fluturon");
   }

    @Override
    public void isMiqsore(){
        System.out.println("papagalli eshte nje shpend miqesor");
    }


}
