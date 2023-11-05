package day17_maps;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class C04_SoyisimdenOgrenciBulma {

    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap = new TreeMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Veli-Han-10-H-MF");
        ogrenciMap.put(108,"Kemal-Cem-11-M-TM");
        ogrenciMap.put(109,"Ayse-Han-10-K-MF");


        // ogrenci map'inde istenen soyisme sahip ogrencilerin
        // sinif sube bolum ve isimlerini yazdirin

        soyisimOgrenciListesi(ogrenciMap,"cem");

    }

    public static void soyisimOgrenciListesi(Map<Integer,String> ogrenciMap, String soyisim){

        // map'deki tum value'lari bir collection olarak kaydedelim
        Collection<String> valueCollection = ogrenciMap.values();

        // tum value'leri gozden gecirmek icin bir for-each loop yapalim

        for (String eachValue : valueCollection
             ) {// eachValue==> "Ayse-Han-10-K-MF"

            // String'deki bilgilere ulasmak icin split() kullanalim

            String[] valueArr = eachValue.split("-");

            if (valueArr[1].equalsIgnoreCase(soyisim)){
                System.out.println(valueArr[2] + " " + valueArr[3]+" " + valueArr[4]+ " " + valueArr[0]);
            }

        }
    }
}
