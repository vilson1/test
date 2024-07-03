package OOP;

public class Katrori {
    /*1. Square Task:
		1.1 Create a class named Square:
				Private variables:
					side

				Encapsulate all the fields

					Condition:
						side of the square should not be negative

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of square
					calcPerimeter(): returns the perimeter of square
					toString(): can display the side, area, perimeter of square when object is passed in print statement*/

    private int brinja;

    public int getBrinja() {
        return brinja;
    }

    public int setBrinja(int brinja) {
        if (brinja<1){
            System.err.println("invalid value!");
            System.exit(-1);
        }else {
            this.brinja = brinja;
        }
        return this.brinja;
    }


    public int gjejSyprinen(){
        return brinja*brinja;
    }

    public int gjejPerimetrin(){
        return brinja*4;
    }

    public Katrori(int brinja){
        this.brinja=setBrinja(brinja);
    }


}
