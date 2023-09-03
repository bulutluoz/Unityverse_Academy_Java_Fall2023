package day09_constructors_staticKeywords;

public class C01_Car {
    String marka = "Marka degeri atanmamis";
    String model = "Model atanmamis";
    String renk ;
    int yil = 1900;
    int ilanNo = 1000;

    C01_Car(){

    }

    public C01_Car(String marka , String model,String renk, int yil, int ilanNo){
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yil = yil;
        this.ilanNo = ilanNo;
    }

    public C01_Car(String marka, String model, String renk, int yil) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yil = yil;
    }

    /*
            bir scope'daki variable'i kullanmak gerektiginde Java oncelikle o scope'a bakar
            Eger bir scope'da iken o scope'daki variable'i degil
            class level'daki variable'i kullanmak isterseniz
            bunu Java'ya soylemeniz lazim

            bir variable'in class level'daki variable oldugunu vurgulamak icin
            this.variableIsmi yazilir.
         */
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
