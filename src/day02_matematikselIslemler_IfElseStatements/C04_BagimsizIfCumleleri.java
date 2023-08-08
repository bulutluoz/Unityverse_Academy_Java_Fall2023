package day02_matematikselIslemler_IfElseStatements;

public class C04_BagimsizIfCumleleri
{
    public static void main(String[] args) {

        int a = 110;
        int b = 27;

        if (a > b) {
            System.out.println("a b'den buyuk");
        }


        if (a % 2 == 0){
            System.out.println("a sayisi cift bir sayidir");
        }

        if (b % 5 == 0){
            System.out.println("b sayisi 5 ile tam bolunebilir");
        }
    }
}
