package constructors;

public class Ofertat {
   /* 1. Create a custom class named Offer
            Attributes:
    location, companyName, jobTitle, salary, smartWork, isFullTime

    Actions:
    setInfo(): sets all the instance variables
    toString(): returns the full info of the Offer Object

		2. Create a class named MyOffers:

            2.1 Create 7 objects of Offer
				2.2 Create an array of Offers named myOffers and store all 7 objects of offers
				2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
						2.3.1 Write a program that can remove the offer objects that are not full-time
				2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
						2.4.1 Write a program that can remove all the offers that are not from local
				2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
						2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
				2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
						2.6.1 Write a program that can remove all the offers that are not for SDET
				2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
						2.7.1 Write a program that can remove all the offers that are offering less than 100K salary

*/

    public String lokacioni, emriKompanise,pozicioni;
    public double paga;
    boolean isSmartWork,isFullTime;

    public Ofertat(){};
    public Ofertat(String emriKompanise){};
    public Ofertat(double paga){};

    public Ofertat(String lokacioni, String emriKompanise, String pozicioni, double paga) {
        this.lokacioni = lokacioni;
        this.emriKompanise = emriKompanise;
        this.pozicioni = pozicioni;
        this.paga = paga;
    }

    public void setInfo(String lokacioni, String emriKompanise, String pozicioni, double paga, boolean isSmartWork, boolean isFullTime) {
        this.lokacioni = lokacioni;
        this.emriKompanise = emriKompanise;
        this.pozicioni = pozicioni;
        this.paga = paga;
        this.isSmartWork = isSmartWork;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Ofertat{" +
                "lokacioni='" + lokacioni + '\'' +
                ", emriKompanise='" + emriKompanise + '\'' +
                ", pozicioni='" + pozicioni + '\'' +
                ", paga=" + paga +
                ", isSmartWork=" + isSmartWork +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
