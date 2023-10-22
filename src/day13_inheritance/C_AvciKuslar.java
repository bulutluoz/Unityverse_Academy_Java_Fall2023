package day13_inheritance;

public class C_AvciKuslar extends B_Kuslar{
    String hareket= "ucarlar";
    String beslenme= "et yerler";
    String pence= "pencelidir";
    String gaga= "sivri gagali";

    public static void main(String[] args) {
        /*
            Eger bir ozellik variable olarak olusturulmussa
            Objenin ozelliklerini ararken
            Aramaya data turunun oldugu class'dan baslarim
            ve buldugumuz ilk variable'in degerini kullaniriz

            Burada Java'nin realize ettigi fikir
            bir obje'nin data turu ne ise
            o data turune sahip tum objelerle
            ayni ozellikleri tasiyor OLMALI
         */

        C_AvciKuslar kartal1 = new C_AvciKuslar();

        System.out.println(kartal1.omur); // A Yasar ve olurler
        System.out.println(kartal1.solunum); // B Akcigerle nefes alir
        System.out.println(kartal1.cogalma); // B Yumurtayla cogalirlar
        System.out.println(kartal1.kanat); // B Kanatlidir
        System.out.println(kartal1.hareket); // C Ucarlar
        System.out.println(kartal1.beslenme); // C Et yerler
        System.out.println(kartal1.gaga); // C Sivri gagali
        System.out.println(kartal1.pence); // C Pencelidir

        B_Kuslar kartal2 = new C_AvciKuslar();
        System.out.println(kartal2.omur); // A Yasar ve olurler
        System.out.println(kartal2.solunum); // B Akcigerle nefes alir
        System.out.println(kartal2.cogalma); // B Yumurtayla cogalirlar
        System.out.println(kartal2.kanat); // B Kanatlidir
        System.out.println(kartal2.hareket); // A Hareket ederler
        System.out.println(kartal2.beslenme); // A beslenirler
        System.out.println(kartal2.gaga); //  B gagalari vardir
        // System.out.println(kartal2.pence); // CTE

        A_Hayvanlar kartal3 = new C_AvciKuslar();

        System.out.println(kartal3.omur); // A Yasar ve olurler
        System.out.println(kartal3.solunum); // A nefes alirlar
        System.out.println(kartal3.cogalma); // A cogalirlar
        //System.out.println(kartal3.kanat); // CTE
        System.out.println(kartal3.hareket); // A Hareket ederler
        System.out.println(kartal3.beslenme); // A Beslenirler
        //System.out.println(kartal3.gaga); // CTE
        // System.out.println(kartal3.pence); // CTE






    }
}
