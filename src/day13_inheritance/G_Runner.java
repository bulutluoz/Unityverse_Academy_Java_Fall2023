package day13_inheritance;

public class G_Runner {

    public static void main(String[] args) {

        /*
            Eger ozellik method olarak olusturulursa

            java hangi method'un calisacagini bulmak icin
            aramaya data turunun oldugu class'dan baslar

            ANCAK buldugu ilk method'u kullanmaz
            method'u bulduktan sonra
            o method isminde daha guncel bir
            method var mi diye kontrol eder
            ve constructor'in oldugu class'a kadar
            en guncel bilgiyi bulup onu kullanir

            Yani
            variable'lar objenin data turu olarak secilen class'daki
            tum objelerin ortak ozelliklerini soylerken

            method'lar o ortak ozelligi kabul eder
            ama varsa daha guncelini soyler

         */

        F_AvciKuslar kartal4 = new F_AvciKuslar();
        kartal4.omur(); // D Yasar ve olurler
        kartal4.solunum(); // E Akcigerle nefes alirlar
        kartal4.cogalma(); // E Yumurtayla cogalirlar
        kartal4.kanat(); // E Kanatlidirlar
        kartal4.hareket(); // F Ucarlar
        kartal4.beslenme(); // F Et yerler
        kartal4.gaga(); // F Sivri gagalidir
        kartal4.pence(); // F Pencelidir


        E_Kuslar kartal5 = new F_AvciKuslar();
        kartal5.omur(); // D Yasar ve olurler
        kartal5.solunum(); // E Akcigerle nefes alirlar
        kartal5.cogalma(); // E Yumurtayla cogalirlar
        kartal5.kanat(); // E Kanatlidirlar
        kartal5.hareket(); // F Ucarlar
        kartal5.beslenme(); // F Et yerler
        kartal5.gaga(); // F Sivri gagalidir
        //kartal5.pence(); // F Pencelidir

        D_Hayvanlar kartal6 = new F_AvciKuslar();
        kartal6.omur(); // D Yasar ve olurler
        kartal6.solunum(); // E Akcigerle nefes alirlar
        kartal6.cogalma(); // E Yumurtayla cogalirlar
        // kartal6.kanat(); // CTE
        kartal6.hareket(); // F Ucarlar
        kartal6.beslenme(); // F Et yerler
        // kartal6.gaga(); // CTE
        // kartal6.pence(); // CTE


        E_Kuslar kus1 = new E_Kuslar();
        kus1.omur(); // D Yasar ve olurler
        kus1.solunum(); // E Akcigerle nefes alirlar
        kus1.cogalma(); // E Yumurtayla cogalirlar
        kus1.kanat(); // E Kanatlidirlar
        kus1.hareket(); // D hareket ederler
        kus1.beslenme(); // D beslenirler
        kus1.gaga(); // E gagalidir
        // kus1.pence(); // CTE

        D_Hayvanlar kus2 = new E_Kuslar();
        kus2.omur(); // D Yasar ve olurler
        kus2.solunum(); // E Akcigerle nefes alirlar
        kus2.cogalma(); // E Yumurtayla cogalirlar
        // kus2.kanat(); // CTE
        kus2.hareket(); // D hareket ederler
        kus2.beslenme(); // D beslenirler
        //kus2.gaga(); // CTE
        //kus2.pence(); // CTE

        D_Hayvanlar hayvan1 = new D_Hayvanlar();
        hayvan1.omur(); // D Yasar ve olurler
        hayvan1.solunum(); // D nefes alirlar
        hayvan1.cogalma(); // D cogalirlar
        // hayvan1.kanat(); // CTE
        hayvan1.hareket(); // D hareket ederler
        hayvan1.beslenme(); // D beslenirler
        //hayvan1.gaga(); // CTE
        //hayvan1.pence(); // CTE













    }
}
