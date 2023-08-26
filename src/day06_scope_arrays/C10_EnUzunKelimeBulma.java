package day06_scope_arrays;

public class C10_EnUzunKelimeBulma {

    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki
        //         en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] isimler = {"Arda","Gamze","Eyup","Cem","Reyyan","Safiye","Mehmet"};

        enUzunEnKisaKelimeler(isimler);

    }

    public static void enUzunEnKisaKelimeler(String[] arr){

        String enUzunKelime= arr[0];
        String enKisaKelime= arr[0];


        for (int i = 0; i < arr.length ; i++) {

            if (arr[i].length() > enUzunKelime.length()){
                enUzunKelime = arr[i];
            }

            if (arr[i].length()<enKisaKelime.length()){
                enKisaKelime = arr[i];
            }
        }

        System.out.println("En uzun kelime : " + enUzunKelime);
        System.out.println("En kisa kelime : " + enKisaKelime);
    }
}
