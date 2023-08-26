package day06_scope_arrays;

public class C09_ElemanSayma {
    public static void main(String[] args) {

        // Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //         ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr = {3,6,4,2,4,3,6,9,7,1,3,5,6,8,9,0};

        int arananSayi = 5;

        istenenElemanSayisiniBulma(arr,arananSayi); // Aranan eleman array'de 1 kere kullanilmis

        istenenElemanSayisiniBulma(arr,4); // Aranan eleman array'de 2 kere kullanilmis

        istenenElemanSayisiniBulma(arr,20); // Aranan element array'de yok

    }


    public static void istenenElemanSayisiniBulma(int[]arr , int arananSayi){

        int sayac=0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] == arananSayi){
                sayac++;
            }
        }
        if (sayac == 0) System.out.println("Aranan element array'de yok");
        else System.out.println("Aranan eleman array'de " + sayac + " kere kullanilmis");
    }
}
