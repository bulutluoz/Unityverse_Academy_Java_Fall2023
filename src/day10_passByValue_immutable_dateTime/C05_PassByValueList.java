package day10_passByValue_immutable_dateTime;

import java.util.ArrayList;
import java.util.List;

public class C05_PassByValueList {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Cem");
        isimler.add("Arda");
        isimler.add("Eyup");
        isimler.add("Reyyan");

        System.out.println("Main method'da listenin ilk hali : "+isimler);
        isimDegistir(isimler);
        System.out.println("Main method'da isimDegistir() den sonra : "+isimler);
        // [Ali, Veli, Can, Reyyan]

        listDegistir(isimler);
        System.out.println("Main method'da listDegistir() den sonra : "+isimler);
        // [Ali, Veli, Can, Reyyan]


    }

    public static void isimDegistir(List<String>  isimler){
        // Bu method isimler listesindeki isimleri update etsin

        isimler.set(0,"Ali");
        isimler.set(1,"Veli");
        isimler.set(2,"Can");
        System.out.println("isim degistir method'unda son hali : "+isimler);

    }


    public static void listDegistir(List<String> isimler){

        isimler = new ArrayList<>();
        isimler.add(0,"Ali");
        isimler.add(1,"Veli");
        isimler.add(2,"Can");
        System.out.println("list degistir method'unda son hali : "+isimler);

    }
}
