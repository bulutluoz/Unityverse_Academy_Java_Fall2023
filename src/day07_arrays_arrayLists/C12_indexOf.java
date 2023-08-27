package day07_arrays_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C12_indexOf {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Cem");
        isimler.add("Arda");
        isimler.add("Eyup");
        isimler.add("Reyyan");

        System.out.println(isimler); // [Cem, Arda, Eyup, Reyyan]

        System.out.println(isimler.indexOf("Eyup")); // 2
        System.out.println(isimler.lastIndexOf("Eyup")); // 2

        isimler.add("Eyup");

        System.out.println(isimler); // [Cem, Arda, Eyup, Reyyan, Eyup]
        System.out.println(isimler.indexOf("Eyup")); // 2
        System.out.println(isimler.lastIndexOf("Eyup")); // 4

        System.out.println(isimler.indexOf("Mehmet")); // -1
        System.out.println(isimler.lastIndexOf("Mehmet")); // -1

    }
}
