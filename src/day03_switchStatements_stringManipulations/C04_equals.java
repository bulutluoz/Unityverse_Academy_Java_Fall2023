package day03_switchStatements_stringManipulations;

public class C04_equals {

    public static void main(String[] args) {

        String str1 = "Not";
        String str2 = "NOT";
        String str3 = "NOt";
        String str4 = "Not";
        String str5 = new String("Not");
        String s= "N";
        String t = "ot";
        String str6 = s + t ;

        System.out.println(str1 == str2); // false
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4); // true
        System.out.println(str1 == str5); // false
        System.out.println(str1 == str6); // false
        System.out.println(str1 == "Not"); // true

        // SIMDILIK : Java'da metinsel ifadelerin ayni olup olmadigini kontrol etmek icin
        //           == yerine equals() kullaniriz
        //           sebebi ilerde anlatilacak
        //          == hem metne hem de stack memory'deki referansa bakar

        System.out.println("=========");
        System.out.println(str1.equals(str2)); // Not -- NOT false
        System.out.println(str1.equals(str3)); // Not -- NOt false
        System.out.println(str1.equals(str4)); // Not -- Not true
        System.out.println(str1.equals(str5)); // Not -- Not true
        System.out.println(str1.equals(str6)); // Not -- Not true
        System.out.println(str1.equals("Not"));// Not -- Not true
    }
}
