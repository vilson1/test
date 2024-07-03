package costom_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAkinatObject {
    public static void main(String[] args) {
        Makinat volvo=new Makinat();
        Makinat WW=new Makinat();
        volvo.setInfo("X40",2020,100000,"e bardhe", "naft");
        System.out.println(volvo);
        WW.setInfo("golf7",2023,50000,"e zeze","benzine");
        System.out.println(WW);
        Makinat[] makinatArray={volvo,WW};
        List<Makinat> makinatList=new ArrayList<>();
        makinatList.add(volvo);
        makinatList.add(WW);
        makinatList.addAll(Arrays.asList(WW,volvo));
        for (Makinat cdoMakine : makinatList) {
            System.out.println("modeli: "+cdoMakine.modeli);
        }


    }
}
