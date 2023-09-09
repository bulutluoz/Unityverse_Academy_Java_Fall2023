package day10_passByValue_immutable_dateTime;

public class C08_StringPool {

    public static void main(String[] args) {

        /*
            Java'da bir String olusturulurken
            bugune kadar yaptigimiz gibi basit yontem kullaniliyorsa (String str = "abc";)
            Java StringPool kullanir, ayni degere sahip ve basit sekilde olusturulmus String'ler icin
            ayni referansi kullanir.
            Boylece == ile karsilastirildiginda referans ve metin ayni oldugundan true verir
         */

        String str1 = "Not"; // SP
        String str2= "N";
        String str3 = "ot";
        String str4 = "Not"; // SP
        String str5 = new String("Not"); // SP degil
        String str6 = str2 + str3 ; // SP degil
        String str7 = "N"+ "ot"; // SP
        String str8 = str2.concat(str3);

        System.out.println(str1 == str4); // true
        System.out.println(str1 == str5); // false
        System.out.println(str1 == str6); // false
        System.out.println(str1 == str7); // true
        System.out.println(str1 == str8); // false
        System.out.println(str1 == "Not"); // true

        System.out.println("===========");

        System.out.println(str1.equals(str4));// true
        System.out.println(str1.equals(str5));// true
        System.out.println(str1.equals(str6));// true
        System.out.println(str1.equals(str7));// true
        System.out.println(str1.equals(str8));// true
        System.out.println(str1.equals("Not"));// true


    }
}
