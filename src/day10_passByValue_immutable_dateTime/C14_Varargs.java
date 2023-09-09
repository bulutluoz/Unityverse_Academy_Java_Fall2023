package day10_passByValue_immutable_dateTime;

public class C14_Varargs {
    public static void main(String[] args) {

        toplama(3,5); // 2 sayinin toplami : 8
        toplama(3,6,7); // 3 sayinin toplami : 16
        toplama(3,6,7,10);
        toplama(3,6,7,10,14);
        toplama(3,6,7,10,14,20);
        toplama(3,6,7,10,14,20,24,1,3,5,6);
        // Argument olarak girilen 11 sayinin toplami : 99

        /*
            int...  int olarak istendigi kadar degisken alabilen
                    ve array altyapisini kullanan varargs'in tanimlayicisidir
         */
    }

    private static void toplama(int... sayilar) {
        // sayilar yollanan tum argumentleri alan bir array'dir

        int elementlerToplami = 0;

        for (int i = 0; i < sayilar.length ; i++) {

            elementlerToplami += sayilar[i];
        }

        System.out.println("Argument olarak girilen "+ sayilar.length+" sayinin toplami : " + elementlerToplami);
    }
}
