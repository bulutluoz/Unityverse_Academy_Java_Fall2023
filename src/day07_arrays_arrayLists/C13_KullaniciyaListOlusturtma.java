package day07_arrays_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C13_KullaniciyaListOlusturtma {

    public static void main(String[] args) {

        // Soru 2- Kullanicidan istedigi kadar isim alip,
        //         Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.

        System.out.println(listOlustur());
    }


    public static List<String> listOlustur(){

        List<String> isimler = new ArrayList<>();
        String girilenIsim = "";
        Scanner scanner = new Scanner(System.in);

        while (!girilenIsim.equalsIgnoreCase("Q")){
            System.out.println("Listeye eklemek icin isim yazin \nBitirmek icin Q'ya basin");
            girilenIsim = scanner.nextLine();

            if (!girilenIsim.equalsIgnoreCase("Q")){
                isimler.add(girilenIsim);
            }
        }

        return isimler;
    }
}
