package day08_arrayList_forEachLoop;

public class C18_Car {
    String marka = "Marka degeri atanmamis";
    String model = "Model atanmamis";
    String renk ;
    int yil = 1900;
    int ilanNo = 1000;

    C18_Car(){


    }

    C18_Car(String mrk, String mdl, String rnk, int yl){
        marka = "Toyota";
        model = "Corolla";
        renk = rnk;
        yil = yl;
    }

    C18_Car(String mrk, String mdl, String rnk, int yl,int ilnno){
        marka = mrk;
        model = mdl;
        renk = rnk;
        yil = yl;
        ilanNo = ilnno;
        /*
            Olusturulan her arac icin bu class'daki variable'lara deger atanir
            - eger default const. kullanilirsa,
              bu class'da atanan ilk degerler veya java'nin atadigi default degerler kullanilir

            - Eger obje olusturulurken
              argument olarak yazilan degerlerin
              objeye atanmasi istenirse
              constructor parametreli olusturulur
              boylece argument olarak parametreye yollanan degerler
              constructor icinde objeye atanir

         */

    }


    @Override
    public String toString() {
        return "Car Ozellikleri {" +
                "marka:'" + marka + '\'' +
                ", model:'" + model + '\'' +
                ", renk:'" + renk + '\'' +
                ", yil:" + yil +
                ", ilanNo:" + ilanNo +
                '}';
    }
}
