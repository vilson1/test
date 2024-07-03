package constructors;


import static constructors.BankAccount.printBankName;

public class AccountObjects {
    public static void main(String[] args) {
        String name="vilson";  //finalize()
        name="Arti";

        System.out.println("name = " + name);
        printBankName();
        printBankName();
        System.out.println("metoda Main");
        BankAccount account1=new BankAccount("vilson shehu","12345678",1000);
        BankAccount account2=new BankAccount("Ornel","987654321",100000);
        BankAccount account3=new BankAccount("Gojart","12345678",15000);
        BankAccount account4=new BankAccount("Feruze","12345678",0);
        account1.emerMbiemer="vilson";
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println(account4);
        account4.depozito(100000);
        System.out.println(account4);
        account2.terheqje(100000);
        System.out.println(account2);
        printBankName();
    }
}
