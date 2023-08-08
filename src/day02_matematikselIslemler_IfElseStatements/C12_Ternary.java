package day02_matematikselIslemler_IfElseStatements;

public class C12_Ternary {
    public static void main(String[] args) {

        int sayi = 0;

        // eger verilen sayi 2'nin kati ise sayinin 2 katini yazdirin
        // 2'nin kati degilse 5 fazlasini yazdirin

        System.out.println( sayi % 2== 0 ? sayi*2 : sayi+5);

        // verilen sayi pozitif ise 3 ile carpin
        // pozitif degilse 20 ekleyin

        sayi = sayi>0 ? sayi*3 : sayi+20 ;

        System.out.println(sayi);

        /*
            ternary bize sonuc dondurdugu icin
            ya direk yazdirmaliyiz veya
            bir degiskene atamaliyiz

            sadece ternary'yi yazarsak java hata verir
            sayi>0 ? sayi*3 : sayi+20 ;
         */

        // verilen sayi 5 ile bolunuyorsa sayiyi 5 ile carpin
        // 5 ile bolunemiyorsa "sayi 5'in kati degil" yazdirin

        if (sayi % 5 == 0){
            sayi = sayi*5;
        }else{
            System.out.println("Sayi 5'in kati degil");
        }

        // bu soruyu ternary ile yapamayiz
    }
}
