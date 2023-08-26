package day06_scope_arrays;

public class C08_PozitifElementlerToplami {

    public static void main(String[] args) {

        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        //        sonucu bize donduren bir method yaziniz.

        int[] arr = {3,11,-7,4,-9};

        System.out.println("Verilen array'deki pozitif elementlerin toplami : "+pozitifElementleriTopla(arr));

    }


    public static int pozitifElementleriTopla(int[] arr){

        // tum elementleri gozden gecirip, pozitif ise toplama ekleyecegiz
        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>0){

                toplam += arr[i];
            }

        }

        return toplam;
    }
}
