package constructors;

public class Piceri {
    public char size;
    public int racioniProshuta, racioniDjathhi;

    //size ->S,M,L   S=400, M= 600, L= 900
    //  proshuta=200,  djathe=100
    // percaktoni cmimin e pices


    public Piceri(char size, int racioniProshuta, int racioniDjathhi) {
        this.size = size;
        this.racioniProshuta = racioniProshuta;
        this.racioniDjathhi = racioniDjathhi;
    }
    public void shtoProshute(int proshute){
        racioniProshuta+=proshute;
    }

    public double cmimi(){
        double cmimi=0;
        if (size=='S'){
            cmimi+=400;
        }else if (size=='M'){
            cmimi+=600;
        }else {
            cmimi+=900;
        }
        cmimi=cmimi+racioniProshuta*200;
        cmimi=cmimi+racioniDjathhi*100;
        return cmimi;
    }

    public void shtoDjathe(int djathe){
        racioniDjathhi+=djathe;
    }

    public String toString() {
        return "Piceri{" +
                "size=" + size +
                ", racioniProshuta=" + racioniProshuta +
                ", racioniDjathhi=" + racioniDjathhi +
                '}';
    }
}
