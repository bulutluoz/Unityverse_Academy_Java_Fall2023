package day12_inheritance;

public class J_Child extends I_Parent{

    String strChild = "Child";
    String str = "ChildStr";

    J_Child(){
        // super() ;   Gorunur bir constructor call olmadigindan Javanin default olarak koydugu super(); calisir
        System.out.println("Child parametresiz constructor");
    }

    J_Child(int sayi){
        super("Java");
        System.out.println("Child int parametreli constructor");
    }

    J_Child(String str){
        super(7);
        System.out.println(str);
        System.out.println("Child String parametreli constructor");
        str = "Son";
    }

    J_Child(boolean bl){
        // super(true);
        // eger parent class'da olmayan bir
        // constructor cagrilirsa
        // CTE olusur
    }

    public static void main(String[] args) {

        J_Child child3 = new J_Child("Ali");
        System.out.println(child3.strChild); // Child
        System.out.println(child3.strParent); // En yeni parent
        System.out.println(child3.strGP); // Super GP
        System.out.println(child3.str); // ChildStr

        J_Child child2 = new J_Child(5);
        System.out.println(child2.strChild); // Child
        System.out.println(child2.strParent); // Yeni Parent
        System.out.println(child2.strGP); // Grand Parent



        J_Child child1 = new J_Child();
        System.out.println(child1.strChild); // Child
        System.out.println(child1.strParent); // Parent
        System.out.println(child1.strGP); // Grand Parent
        System.out.println(child1.str); // ChildStr
        /*
            Child class'da bir obje olusturuldugunda
            parent class'lardaki tum ozelliklere de sahip olur
            ANCAK
            java'nin bir obje'ye ilk deger atamasi (initialization) icin
            CONSTRUCTOR calismalidir
            Java bunun icin ozel bir mekanizma olusturmustur

            extends kullanan bir class'daki
            her constructor'in ilk satirinda
            MUTLAKA bir constructor call olur
            eger gorunur bir constructor call yoksa
            Java default olarak
            super() koyar
         */
    }
}
