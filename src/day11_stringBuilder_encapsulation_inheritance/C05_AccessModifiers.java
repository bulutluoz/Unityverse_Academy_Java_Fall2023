package day11_stringBuilder_encapsulation_inheritance;

public class C05_AccessModifiers {

    // Bir class uyesi olusturuldugunda Access Modifier olmak ZORUNDADIR
    String str ; // eger gorunur bir access modifier yoksa
                 // Java default access modifier tanimlar


    private static String strPrivate = "private String";
    private static void methodPrivate(){
        System.out.println("Private method");
    }

    static String strDefault = "default String";
    static void methodDefault(){
        System.out.println("Default method");
    }


    protected static String strProtected = "protected String";
    protected static void methodProtected(){
        System.out.println("Protected method");
    }

    public static String strPublic = "public String";
    public static void methodPublic(){
        System.out.println("Public method");
    }

    public static void main(String[] args) {

        System.out.println(strPrivate); // private String
        strPrivate = "main method'dan deger atadim";

        System.out.println(strDefault);
        System.out.println(strProtected);
        System.out.println(strPublic);
        methodPrivate();
        methodDefault();
        methodProtected();
        methodPublic();
    }

}
