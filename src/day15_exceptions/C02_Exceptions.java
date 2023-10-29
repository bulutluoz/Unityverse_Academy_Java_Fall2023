package day15_exceptions;

public class C02_Exceptions {

    public static void main(String[] args) {

        /*
            Exception yakalandiktan sonra
            Catch blogunda ne yapacaginiz tamamen size kalmistir
            - hic bir sey yapmayabiliriz
            - catch parantezindeki e objesini kullanarak hazir method'larla konsolda bilgi verebiliriz
            - kendi istedigimiz bir mesaji yazdirabiliriz
            - madem ki kodda sorun var ben baska kod calistirmak istiyorum diyebilirsiniz
         */

        String str = "Java Candir";


        try {
            System.out.println(str.substring(20));

        } catch (StringIndexOutOfBoundsException e) {

            // System.out.println("Girilen index String'in sinirlari disinda");
            // System.out.println(e); // java.lang.StringIndexOutOfBoundsException: String index out of range: -9
            // System.out.println(e.getCause()); // null
            // System.out.println(e.getMessage()); // String index out of range: -9
            e.printStackTrace(); // exception olustugunda konsolda cikan tum yazilari yazdirir
        }

        System.out.println("Kodlar duzgun calismazsa bu satir yazdirilmaz");

    }
}
