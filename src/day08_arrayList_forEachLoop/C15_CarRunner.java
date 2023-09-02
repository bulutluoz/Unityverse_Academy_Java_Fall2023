package day08_arrayList_forEachLoop;

public class C15_CarRunner {

    public static void main(String[] args) {

        C14_Car car1 = new C14_Car();

        System.out.println(car1.marka);// Marka degeri atanmamis
        System.out.println(car1.model); // Model atanmamis
        System.out.println(car1.renk); // null


        // System.out.println(car1); // Car@e580929
        // obje olusturdugumuz class'da toString() kullanilmamissa
        // objeyi yazdirdigimizda sadece referans degerini yazdirir

        // ilgili class'da toString() olusturulursa

        System.out.println(car1);
        // C14_Car{marka='Marka degeri atanmamis', model='Model atanmamis', renk='null', yil=1900, ilanNo=1000}

        car1.marka = "Toyota";
        car1.model ="Corolla";
        car1.renk = "Kirmizi";
        car1.yil = 2018;
        car1.ilanNo = 4563;

        System.out.println(car1);
        // Car Ozellikleri {marka:'Toyota', model:'Corolla', renk:'Kirmizi', yil:2018, ilanNo:4563}

        car1.maxHiz();
    }
}
