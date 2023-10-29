package day15_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_CheckedExceptions {

    public static void main(String[] args) throws  IOException {

        /*
            Checked exception'larda 2 alrternatifimiz var
            1- try-catch ile exception'i kontrol altina alabiliriz
               boylece exception olustugunda
               bizim istedigimiz islemi (catch blogu) yapar
               ve kod calismaya devam eder

            2- Eger exception olustugunda kodun calismaya devam etmesini istemiyorsaniz
               Sadece riskin farkinda oldugunuzu Java'ya deklare etmek
               ve sonradan kodu inceleyenlere bu method'un
               bir exception riski barindirdigini bildirmek icin
               method signature'ina "throws beklenenException" ekleriz

               Boylece Java kodun altindaki kirmizi cizgiyi kaldirir
               kodun calismasina izin verir
               AMMA kod dosyaya erisemezse
               Exception firlatir ve CALISMAYI DURDURUR
         */

        /*
            IOException Java'da bir dosyaya erisip,
            o dosya ile ilgili islem yaparken karsilasabilecegimiz
            tum exception'lari kapsar

            FileNotFoundException da IOException'in child class'idir

            Method deklarasyonunda birbiri ile parent-child iliskisi olan
            exception'lari yazmamiz gerektiginde
            sadece parent exception'i yazmamiz yeterli olacaktir.

            Cunku parent exception daha kapsamlidir
            ve child class'in yakalayacagi exception'lari da yakalar
         */

        String dosyaYolu = "src/day15_exceptions/text1.txt";

        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

        int k=0;
        while((k= fileInputStream.read() ) != (-1)) {
            System.out.print((char) k);
        }




    }
}
