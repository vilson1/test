package arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8,9};

        int shuma=0;

        for(int eachNumber  : num ){
            System.out.println(eachNumber);
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        //gjeni shumen e numrave ne array
        for(int cdoNumer  : num ){
            shuma+=cdoNumer;
        }
        System.out.println("shuma = " + shuma);

        //printo shkronjen e pare dhe te fundit te fjaleve ne nje array
        // gjeni sa here perseritet nje fjale ne nje array

        String[] emrat={"Vilson","Arti","Rezi","Ornel","Sandri","Kaci","Rezi","Ornel","Sandri","Kaci","Kaci","Rezi"};
        for(String emri  :  emrat){
            //System.out.println(emri.charAt(0)+","+emri.charAt(emri.length()-1));
            int count=0;

            for ( String emriPerKontroll  : emrat){
                if (emri.equals(emriPerKontroll)){
                    count++;
                }
            }
            System.out.println(emri+" = "+  count);
        }

    }
}
