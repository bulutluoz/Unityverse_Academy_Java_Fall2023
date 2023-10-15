package day12_inheritance;

import day11_stringBuilder_encapsulation_inheritance.C05_AccessModifiers;

public class C01_FarkliPackageChildClass extends C05_AccessModifiers {

    // bir class extends keyword kullanarak baska class'i Parent edinebilir

    public static void main(String[] args) {

        //System.out.println(C05_AccessModifiers.strPrivate);
        //System.out.println(C05_AccessModifiers.strDefault); // default String
        System.out.println(C05_AccessModifiers.strProtected); // protected String
        System.out.println(C05_AccessModifiers.strPublic); // public String

        C05_AccessModifiers.strPublic = "ayni package'dan deger atayabilirim";

        //C05_AccessModifiers.methodPrivate();
        // 'methodPrivate()' has private access in 'day11_stringBuilder_encapsulation_inheritance.C05_AccessModifiers'
        //C05_AccessModifiers.methodDefault(); // Default method
        C05_AccessModifiers.methodProtected();
        C05_AccessModifiers.methodPublic();
    }

}
