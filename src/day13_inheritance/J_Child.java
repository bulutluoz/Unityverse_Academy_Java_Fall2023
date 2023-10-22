package day13_inheritance;

public class J_Child extends I_Parent{


    public void method1(){
        // overriding(gecersiz kilan) method'un yaninda yukari yonlu ok olur
        // overridde(gecersiz kilinan) method'un yaninda asagi dogru ok olur
    }

    public void method2(String str){
       // bir method'un overriding yapmasi icin
       // SIGNATURE'i parent class'daki method ile
       // AYNI OLMALIDIR

       // Signature : method ismi
       //             ve parametrelerin data turleri
    }

    @Override
    public void method3() {

    }


    public void method4() {
        // overriding method istenirse @Override
        // notasyonu kullanabilir
        // notasyon kullanirsak parent class'daki method
        // silinir veya override edilemeyecek sekilde degistirilirse
        // notasyon CTE verir ve duzeltilmesini saglar

    }

    public static void method5(){
        // static method'lar override edilemez
    }

    private void method6(){
        // parent class'daki private method'u goremeyecegi icin
        // child class'daki method bagimsiz bir method olur
    }
    /*
    public void method7(){
        java'da final keyword'u DEGISTIRILEMEZ demektir
        parent class'da final olarak isaretlenen bir method
        degistirilemeyecegi icin override edilemez
    }

     */



     void method8() {
      // parent class'daki method8'in access modifer'i
      // default access modifier'dir.
      // child clas'daki method'un access modifier'i
      // parent'inki ile ayni veya daha genis olabilir
      // bu method icin default, protected veya public secilebilir
    }

    public void method9(){
       // access modifier parent class'daki
       // method'un access modifier'i ile ayni veya
       // daha genis olmali
    }

    public void method10(){

        // void veya primitive data turu return eden method'lari
        // override etmek icin return type'lari ayni olmalidir
     }


    public int method11() {
       return 5;
    }

    public String method12(){
         // return type non-primitive ise
        // Ya ayni olmali
        // veya child'in return type'i ile
        // parent'in return type arasinda
        // IS-A reletionship olmali
        // buna co-variant denir
         return null;
    }

}
