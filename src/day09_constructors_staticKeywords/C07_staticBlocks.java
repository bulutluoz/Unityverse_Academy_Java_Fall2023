package day09_constructors_staticKeywords;

public class C07_staticBlocks {

    C07_staticBlocks(){
        System.out.println("Constructor calisti");
    }


    public static void main(String[] args) {

        System.out.println("main method calisti");

        C07_staticBlocks obj = new C07_staticBlocks();

    }



    static {
        // class calistirildiginda her seyden(main method'dan bile) once calisir
        System.out.println("Static block 2 calisti");
    }
    static {
        System.out.println("Static block 1 calisti");
    }

    {
        // sadece obje olusturuldugunda calisir
        // constructor calismadan once, static olmayan block'lar calisir, sonra constructor calisir
        System.out.println("static olmayan block 1 calisti");

    }

    {
        System.out.println("static olmayan block 2 calisti");
    }



}
