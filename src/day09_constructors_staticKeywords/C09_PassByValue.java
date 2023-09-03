package day09_constructors_staticKeywords;

public class C09_PassByValue {

    public static void main(String[] args) {

        String str = "Java Candir";

        // Bir method olusturarak a harflerini silip, yeni halini main method'a dondurun

        System.out.println("Method call : "+aSil(str));
        System.out.println("Method call sonrasi main methodda str : " + str);


        // main method'daki str'in KALICI olarak a'siz olmasini istersek
        str = aSil(str);

        System.out.println("Kalici hale getirmek icin atama yaptiktan sonra str : " + str);
    }


    public static String aSil(String str){

        str= str.replace("a","");
        System.out.println("Method icinde a'siz str : " + str);

        return str;
    }
}
