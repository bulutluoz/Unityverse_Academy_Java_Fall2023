package day03_switchStatements_stringManipulations;

public class C05_equalsIgnoreCase {

    public static void main(String[] args) {

        String str1 = "Not";
        String str2 = "NOT";
        String str3 = "NOt";
        String str4 = "Not";
        String str5 = new String("Not");


        System.out.println(str1.equals(str2)); // Not -- NOT false
        System.out.println(str1.equals(str3)); // Not -- NOt false
        System.out.println(str1.equals(str4)); // Not -- Not true
        System.out.println(str1.equals(str5)); // Not -- Not true

        // Eger ESITLIGI kontrol ederken case sensitive olmasini istemezseniz

        System.out.println(str1.equalsIgnoreCase(str2)); // Not -- NOT true
        System.out.println(str1.equalsIgnoreCase(str3)); // Not -- NOt true
        System.out.println(str1.equalsIgnoreCase(str4)); // Not -- Not true
        System.out.println(str1.equalsIgnoreCase(str5)); // Not -- Not true
    }
}
