package day08_arrayList_forEachLoop;

public class C16_Car {

    String marka = "Marka degeri atanmamis";
    String model = "Model atanmamis";
    String renk ;
    int yil = 1900;
    int ilanNo = 1000;

    C16_Car (String rnk){
        renk = rnk;
        System.out.println("Toyota araclara renk atanmalidir");
    }

    C16_Car(){
        // Default constructor'in yerine gecer
        // parametresiz constructor
    }

    /*
        Bir class'da gorunur bir constructor olusturuldugunda
        Java default constructor'i siler

        Bu durum daha onceden default constructor'i kullanarak
        obje olusturan tum class'lari etkileyeceginden
        biz gorunur bir constructor olusturdugumuzda
        soruna yol acmamak icin
        default constructor yerine
        parametresiz bir constructor da olustururuz
     */
}
