package day18_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMapOlusturmaMethodKullanimi {

    public static void main(String[] args) {

        Map<Integer,Map<String,String>> okulMapi = new HashMap<>();

        okulMapi = ogrenciEkle(okulMapi,101,"Ayse","Mercan","10","L","MF");

        okulMapi = ogrenciEkle(okulMapi,102,"Kemal","Karaman","11","A","MF");

        okulMapi = ogrenciEkle(okulMapi,103,"Ali","Can","12","B","TM");

        System.out.println(okulMapi);


        // 103 numarali ogrencinin bolumunu yazdirin

        System.out.println(okulMapi.get(103).get("bolum")); // TM


    }





    public static Map<Integer, Map<String, String>> ogrenciEkle(Map<Integer, Map<String, String>> okulMapi,
                                    Integer ogrenciNo, String isim, String soyisim, String sinif, String sube, String bolum) {


        Map<String,String>  eklenecekOgrencimapi = new HashMap<>();
        eklenecekOgrencimapi.put("isim",isim);
        eklenecekOgrencimapi.put("soyisim",soyisim);
        eklenecekOgrencimapi.put("sinif",sinif);
        eklenecekOgrencimapi.put("sube",sube);
        eklenecekOgrencimapi.put("bolum",bolum);

        okulMapi.put(ogrenciNo,eklenecekOgrencimapi);

        return okulMapi;

    }


}
