package costom_class;

import constructors.BankAccount;

import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {
        //intstant variable-> eshte nje variabel qe krijohet jashte metodes dhe brenda klases
        // instant method- eshte nje metode qe therritet me ane te emrit te objektit.

        Dog dog1=new Dog();
        dog1.emri="Balo";
        dog1.gjinia='M';
        dog1.mosha=3;
        dog1.ngjyra="i bardhe";
        BankAccount account1=new BankAccount("vilson shehu","12345678",1000);
        Dog dog2=new Dog();
        dog2.emri="Rexi";
        dog2.gjinia='M';
        dog2.mosha=5;
        dog2.ngjyra="i zi";

        System.out.println(dog1);
        System.out.println(dog2);

        //krijoni nje klase me emrin makinat
        // variabla do te jene : modeli,viti prodhimit, km, ngjyra, karburanti
        // metodat do te jene : eShpejte , konsumi, komforti,
    }

}
