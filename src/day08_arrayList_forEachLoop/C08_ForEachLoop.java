package day08_arrayList_forEachLoop;

public class C08_ForEachLoop {

    public static void main(String[] args) {

        int[] arr = {4,6,7,8,1,3,6,7,89,3};

        // array'deki tum elementlerin toplamini yazdirin

        int toplam =0;

        for (int i = 0; i < arr.length ; i++) {

            toplam += arr[i];
        }

        System.out.println("For loop ile elementler toplami : " + toplam); // 134


        // For-each loop , Index'e bagimli olmaksizin, tum elementleri bize getirir

        toplam =0;
        // for-each loop'a 3 seyi soylememiz gerekir
        // 1- hangi data turunde elementlerin gelecegi
        // 2- loop'un getirdigi elementi loop icinde hangi isimle kullanacagimiz
        // 3- elementlerin getirilecegi java yapisi

        for (int each : arr
             ) {
            toplam += each;
        }

        System.out.println("For-each loop ile toplam : " + toplam);
    }
}
