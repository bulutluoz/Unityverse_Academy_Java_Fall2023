package day11_stringBuilder_encapsulation_inheritance;

public class C02_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");

        // append sadece sona ekleme yapar
        sb1.append(" Candir"); // Java Candir

        // araya ekleme yapmak istersek insert() kullanilir
        // eger insert etmek istedigimiz metni baska bir variable'dan almak istersek
        // alacagimiz metnin baslangic ve bitis index'lerini yazarak alabiliriz

        sb1.insert(0,"Bence "); // Bence Java Candir


        String str = "Tava Candir.";

        sb1.insert(0,str,0,5); // Tava Bence Java Candir





        System.out.println(sb1);
    }
}
