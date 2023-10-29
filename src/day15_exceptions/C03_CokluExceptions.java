package day15_exceptions;

public class C03_CokluExceptions {

    public static void main(String[] args) {

        String str = "Java candir";
        int[] arr = {2,4,5,6,7,5,3,2,2,4,6,9};

        // input olarak verilen tamsayiyi alip
        // string ve array'de o index'deki elementleri yazdirin

        int input = 20;
        // Birden fazla riskli durum varsa
        // 4 ihtimalimiz var
        // 1- ayri ayri try - catch yapabiliriz
        //    iki exception'i da detayli olarak kontrol altina almis oluruz

        /*
        try {
            System.out.println(arr[input]); // 9
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index array'in disinda");
        }


        try {
            System.out.println(str.substring(input,input+1)); // r
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("index String'in disinda");
        }
         */

        // ic ice try catch bloklari kullanabiliriz
        // ic ice yapilar karmasik oldugundan cok tavsiye edilmez

        /*
        try {
            System.out.println(str.substring(input,input+1));
            try {
                System.out.println(arr[input]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("index array'in disinda");
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("index String'in disinda");
        }

         */

        // 3- 1 try, birden fazla catch ekleyebiliriz
        //    ilk karsilastigi exception'i yazdirir


        try {
            System.out.println(arr[input]);
            System.out.println(str.substring(input,input+1));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index array'in disinda");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("index String'in disinda");
        }




        // 4- olusabilecek tum exception'lari kapsayan bir tek catch yazilabilir
        //    daha genel bir aciklama yazilabilir
        //    sorunun spesifik kaynagi bulunamayabilir
        /*
        try {
            System.out.println(str.substring(input,input+1));
            System.out.println(arr[input]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Index str veya array'in sinirlari disinda");
        }

         */


    }

}
