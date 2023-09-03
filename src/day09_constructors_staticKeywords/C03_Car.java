package day09_constructors_staticKeywords;

public class C03_Car {
    String marka = "Marka degeri atanmamis";
    String model = "Model atanmamis";
    String renk ;
    int yil = 1900;
    int ilanNo = 1000;

    C03_Car(){
        System.out.println("Parametresiz cons calisti");
    }

    public C03_Car(String marka){
        // C03_Car();
        /*
            Bir constructor'in icinde baska bir constructor'i cagirmak (call) isterseniz
            cagrilacak constructor ismini yazabiliriz
            ANCAK Java C03_Car(); syntax'ini method call olarak algilar

            istedigimiz islemin method call degil constructor call oldugunu
            vurgulamak icin this(istenenParametreler) syntax'i kullanilir
         */
        this();
        System.out.println("Parametreli constructor calisti");

    }

    public C03_Car(int yil){

        this("Mercedes");
        // this();
    }


}
