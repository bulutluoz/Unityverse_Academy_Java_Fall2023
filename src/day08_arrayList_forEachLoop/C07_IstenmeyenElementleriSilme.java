package day08_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C07_IstenmeyenElementleriSilme {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Arda");
        isimler.add("Eyup");
        isimler.add("Cem");
        isimler.add("Gamze");

        // Listede icinde e harfi bulunan isimleri silin

        // silmek yerine silinmeyecek elementleri gecici bir listeye kaydedelim

        List<String> geciciList = new ArrayList<>();

        for (int i = 0; i <isimler.size() ; i++) {

            if (!isimler.get(i).contains("e")){
                geciciList.add(isimler.get(i));
            }
        }

        System.out.println("loop'dan sonra isimler : "+ isimler);
        System.out.println("loop'dan sonra gecici list : "+ geciciList);

        isimler = geciciList;

        System.out.println("atamadan sonra isimler : "+ isimler);
        System.out.println("atamadan sonra gecici list : "+ geciciList);
    }
}
