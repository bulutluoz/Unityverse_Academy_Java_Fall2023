package day08_arrayList_forEachLoop;

public class C19_Runner {

    public static void main(String[] args) {

        C18_Car car1 = new C18_Car();
        car1.marka ="Opel";
        car1.model ="Corsa";
        car1.renk ="Mavi";
        car1.yil =2008;
        car1.ilanNo = 2345;

        System.out.println(car1);
        // Car Ozellikleri {marka:'Opel', model:'Corsa', renk:'Mavi', yil:2008, ilanNo:2345}


        C18_Car car2 = new C18_Car();
        System.out.println(car2);
        // Car Ozellikleri {marka:'Marka degeri atanmamis', model:'Model atanmamis', renk:'null', yil:1900, ilanNo:1000}

        C18_Car car3 = new C18_Car("Toyota","Corolla","Kirmizi",2015,5643);
        System.out.println(car3);
        // Car Ozellikleri {marka:'Toyota', model:'Corolla', renk:'Kirmizi', yil:2015, ilanNo:5643}


        C18_Car car4 = new C18_Car("Renault","Toros","Yesil",2000);
        System.out.println(car4);

        // Car Ozellikleri {marka:'Toyota', model:'Corolla', renk:'Yesil', yil:2000, ilanNo:1000}

    }

}
