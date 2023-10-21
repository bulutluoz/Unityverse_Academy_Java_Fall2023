package day12_inheritance;

public class G_ConstructorCall {

    int sayi = 20;
    String str = "Java";

    G_ConstructorCall (){
        System.out.println("parametresiz cons");
    }

    G_ConstructorCall (String str){
        this (3);
        str = "Tava";
        System.out.println("String parametreli cons.");
        System.out.println(str);
    }
    G_ConstructorCall (int sayi){
        this.sayi = sayi;
        System.out.println("int parametreli cons.");
        System.out.println(sayi);
    }

    public static void main(String[] args) {

        G_ConstructorCall obj1 = new G_ConstructorCall("abc");
        System.out.println(obj1.sayi);
        System.out.println(obj1.str);
    }
}
