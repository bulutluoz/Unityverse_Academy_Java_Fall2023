package day07_arrays_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C14_IstenmeyenElementleriSilme {

    public static void main(String[] args) {

        // Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip,
        //         kalan kismini list olarak bize donduren bir method olusturun


        List<String> isimler = new ArrayList<>();

        isimler.add("Cem");
        isimler.add("Arda");
        isimler.add("Eyup");
        isimler.add("Reyyan");

        String istenmeyenHarf = "a";

        System.out.println(istenmeyenleriSil(isimler,istenmeyenHarf)); // [Cem, Eyup]
        System.out.println(istenmeyenleriSil(isimler, "e")); // [Arda, Eyup]

    }

    public static List<String> istenmeyenleriSil(List<String> liste , String istenmeyenHarf){

        // bir forloop ile gozden gecirdigimiz bir listede silme yaparsak
        // index'ler kayacagi icin, arada kontrol edilmeyen elementler olabilir
        // bu durumda 2.bir liste olusturup, silinmeyecek elementleri yeni listeye eklemek
        // daha dogru bir yaklasim olur

        List<String> istenenListe = new ArrayList<>();

        for (int i = 0; i < liste.size() ; i++) {

            if (!liste.get(i).contains(istenmeyenHarf)){
                istenenListe.add(liste.get(i));
            }
        }
        return istenenListe;
    }
}
