package day03_switchStatements_stringManipulations;

public class C11_KullanimSayisiBulma {

    /*
        Kullanicidan bir cumle ve bir harf isteyin
        Verilen cumle ve harfe gore asagidaki cumlelerden
        uygun olani yazdirin

        1- Cumle harfi icermiyor
        2- Cumlede harf sadece 1 kere kullanilmis
        3- cumlede harf 1'den fazla kullanilmis
     */

    public static void main(String[] args) {
        String str = "Java ogrendikce guzellesiyor";
        String arananHarf = "e";

        // once aranan harfin ilk kullanim index'ini bulalim
        int ilkIndex= str.indexOf(arananHarf);

        // aranan harfin ikinci index'ini bulalim
        int ikinciIndex= str.indexOf(arananHarf, ilkIndex+1);

        if (ilkIndex == -1){
            System.out.println("Cumle harfi icermiyor");

        } else if (ikinciIndex == -1) {
            System.out.println("Cumlede harf sadece 1 kere kullanilmis");

        }else{
            System.out.println("cumlede harf 1'den fazla kullanilmis");
        }
    }




}
