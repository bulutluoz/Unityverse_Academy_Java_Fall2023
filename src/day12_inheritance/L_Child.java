package day12_inheritance;

public class L_Child extends K_ClassUyeleriniKullanma{

    L_Child(){
        this(5);

    }

    L_Child(int sayi){

    }

    String str  = "Hava";
    int sayi = 20;
    boolean bl = true;

    public static void main(String[] args) {

        L_Child obj = new L_Child();
        obj.method2();
    }

    public void method2(){

        String str = "Civa";
        int a = 20;

        System.out.println(bl); // true
        System.out.println(this.bl); // true
        //System.out.println(super.bl); // CTE

        System.out.println(a); // 20
        // System.out.println(this.a); // CTE
        // System.out.println(super.a); // CTE

        System.out.println(str); // Civa
        System.out.println(this.str); // Hava
        System.out.println(super.str); // Java

        System.out.println(sayi); // 20
        System.out.println(this.sayi); // 20
        System.out.println(super.sayi); // 30

        System.out.println(ch); // k
        System.out.println(this.ch); // k
        System.out.println(super.ch); // k





    }
}
