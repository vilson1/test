package review_methods;

public class exercise1 {

    //krijoni  nje metode ku do te shkruani nje array int nje  numer qe do e shtoni edhe indeksin ku do shtohet numri.
    //array={1,2,3} metode(array,5,2)=>array2={1,2,5,3}
    public static int[] addOneNumberToArray(int[] array,int numberToAdd, int index){
        int arrayLenth=array.length+1;
        int[] newArray= new int[arrayLenth];
        int indexCount=0;
        for (int i = 0; i < arrayLenth; i++) {
            if (i==index){
                newArray[i]=numberToAdd;
            }else {
                newArray[i]=array[index];
                indexCount++;
            }
        }
        return newArray;
    }
}
