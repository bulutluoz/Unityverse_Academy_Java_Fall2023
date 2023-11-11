package day18_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C05_FarkliDataTurleriIleMapOlusturma {

    public static void main(String[] args) {

        /*
                {
            "firstname" : "Ahmet",
            "lastname" : "Bulut",
            "totalprice" : 500,
            "depositpaid" : false,
            "bookingdates" : {
                   "checkin" : "2023-07-21",
                   "checkout" : "2023-08-10"
                      },
            "additionalneeds" : "wi-fi"
            }


         */

        Map<String, Object> rezervasyonMapi = new HashMap<>();
        rezervasyonMapi.put("firstname","Ahmet");
        rezervasyonMapi.put("lastname","Bulut");
        rezervasyonMapi.put("totalprice",500);
        rezervasyonMapi.put("depositpaid",false);

        Map<String,String> bookingdatesMapi = new HashMap<>();
        bookingdatesMapi.put("checkin","2023-07-21");
        bookingdatesMapi.put("checkout","2023-08-10");

        rezervasyonMapi.put("bookingdates",bookingdatesMapi);
        rezervasyonMapi.put("additionalneeds","wi-fi");

        System.out.println(rezervasyonMapi);

        /*
                {
                firstname=Ahmet,
                additionalneeds=wi-fi,
                bookingdates= {
                                checkin=2023-07-21,
                                checkout=2023-08-10
                                },
                totalprice=500,
                depositpaid=false,
                lastname=Bulut
                }
         */

        // musteri ismini yazdirin
        System.out.println(rezervasyonMapi.get("firstname")); // Ahmet

        // musteri fiyatini yazdirin
        System.out.println(rezervasyonMapi.get("totalprice")); // 500

        // musteri checkin tarihini yazdirin

        System.out.println(rezervasyonMapi.get("bookingdates")); // {checkin=2023-07-21, checkout=2023-08-10}

        System.out.println(((Map<String, String>) rezervasyonMapi.get("bookingdates")).get("checkin")); // 2023-07-21

        // musteri checkout tarihini yazdirin

        System.out.println(((Map) rezervasyonMapi.get("bookingdates")).get("checkout")); // 2023-08-10


    }
}
