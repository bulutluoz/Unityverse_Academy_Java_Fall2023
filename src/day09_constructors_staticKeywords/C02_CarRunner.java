package day09_constructors_staticKeywords;

public class C02_CarRunner {

    public static void main(String[] args) {

        C01_Car car1 = new C01_Car();
        System.out.println(car1);
        // Car Ozellikleri {marka:'Marka degeri atanmamis', model:'Model atanmamis', renk:'null', yil:1900, ilanNo:1000}

        car1.marka = "Opel";
        car1.renk = "Mavi";

        System.out.println(car1);
        // Car Ozellikleri {marka:'Opel', model:'Model atanmamis', renk:'Mavi', yil:1900, ilanNo:1000}

        C01_Car car2 = new C01_Car("Nissan","Micra","Beyaz",2010,1234);
        System.out.println(car2);
        // Car Ozellikleri {marka:'Nissan', model:'Micra', renk:'Beyaz', yil:2010, ilanNo:1234}


    }
}
