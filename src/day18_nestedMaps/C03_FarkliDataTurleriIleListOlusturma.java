package day18_nestedMaps;

import java.util.ArrayList;
import java.util.List;

public class C03_FarkliDataTurleriIleListOlusturma {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Arda");
        isimler.add("Aykut");
        isimler.add("Gamze");
        //isimler.add(10);
        //isimler.add(true);
        // isimler.add(new ArrayList<Integer>());

        // Gercek hayatta birden fazla data turunu iceren yapilar olabilir
        // Java'da farkli data turleri ile list gibi yapilar olusturabiliriz

        List<Object> herseyListesi = new ArrayList<>();

        herseyListesi.add("Arda");
        herseyListesi.add(10);
        herseyListesi.add(true);
        herseyListesi.add(isimler);

        System.out.println(herseyListesi);
        // [Arda, 10, true, [Arda, Aykut, Gamze]]


        // listenin ilk elemani olan Arda'yi buyuk harflerle yazdiralim
        System.out.println(((String) herseyListesi.get(0)).toUpperCase()); // ARDA

        // listenin ikinci elemani olan 10'u 3 artirin

        System.out.println((((Integer) herseyListesi.get(1)) + 3)); // 13

        // listenin son elementi olan isimler listesinin 2.elemani olan Aykut'u yazdirin

        System.out.println(herseyListesi.get(3)); // [Arda, Aykut, Gamze]

        System.out.println(((List<String>) herseyListesi.get(3)).get(1)); // Aykut

    }
}
