package constructors;

public class BankAccount {
    /*BankAccount Task:
	        Attributes:
	                1. accountHolder, 2. accountNumber, 3. balance

	        Actions:
	        	1. setInfo(): sets the accountHolder and accountNumber attributes
	        	2. toString()
	            3. checkBalance():displays the available balance
	            2. deposit(): increases the balance by the given amount
				3. withdraw(): decreases the balance by the given amount*/


    public String emerMbiemer, numriLlogarise;
    public double balanca;
    public static String kombesia="shqipetar";

    public static void printBankName(){
        System.out.println("bank name: BKT");
    }
    public BankAccount(String emerMbiemer, String numriLlogarise, double balanca) {
        this.emerMbiemer = emerMbiemer;
        this.numriLlogarise = numriLlogarise;
        this.balanca = balanca;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "emerMbiemer='" + emerMbiemer + '\'' +
                ", numriLlogarise='" + numriLlogarise + '\'' +
                ", balanca=$ " + balanca +
                '}';
    }

    public double balanca(){
        System.out.println(balanca);
        return balanca;
    }

    public void depozito(double shumaDepozites){
        if (shumaDepozites>=0) {
            balanca += shumaDepozites;
        }else {
            System.err.println("Shuma eshte numer negativ");
        }
    }

    public void terheqje(double shumaPerTeTerhequr){
        if (shumaPerTeTerhequr>balanca){
            System.err.println("Shuma e vendosur e kalon limitin");
        }else if (shumaPerTeTerhequr<0){
            System.err.println("Ju lutem vendosi nje numer pozitiv!");
        }else {
            balanca -=shumaPerTeTerhequr;
        }
    }
    static {
        if (kombesia.equals("kosova"))
        kombesia="shqipetar";
        System.out.println("bllok");
    }
}
