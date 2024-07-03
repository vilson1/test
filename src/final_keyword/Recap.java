package final_keyword;

public class Recap extends Person {
    public Recap(String ditelindja, String kombesia, String emri) {
        super(ditelindja, kombesia, emri);
    }



    /*Encapsulation - fshehja e te dhenave
                 --> access modifier private
                 --> gjenerojme getters edhe setters
                   -->getters-> lexojme variablat e bejme access modiffier public return type eshte e njejte me data type e variables
                   --> setter -> ne io japim vlere ose ndryshojme vleren e variables

                   public class Animals{
                    private char gjinia

                    public char getGjinia(){
                    return this.gjinia;

                    public void setGjinia(char gjinia)
                    this.gjinia=gjinia;\





                   }

                   public class Cat{
                   private Animals animals;

                  public Animals getAnimal(){
                   return animals;
                   }

                   public void setAnimals(Animals animals){
                   this.animals=animals;
                   }
                   }


            //Inheritance --> trashegimia, is A Relation
            - kemi nje klase qe trashegohet ne nje klase tjeter
            -subclass ->klasa e cila trashegon -femija
            -super class -> klasa e cila trashegohet -prindi
            - konstruktori, jane metodat dhe variablat qe jane private nuk trashegohen
            -> super class nuk trashegon nga sub class
            */
    public static void main(String[] args) {

        ProtectedAccessModifier.emri="abc";
        ProtectedAccessModifier.mbiemri="abc";

    }

}
