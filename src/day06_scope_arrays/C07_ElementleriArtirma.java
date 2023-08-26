package day06_scope_arrays;

import java.util.Arrays;

public class C07_ElementleriArtirma {
    public static void main(String[] args) {

        // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip
        //         bize donduren bir method olusturun.
        //         Eski array’i yeni haliyle kaydedin.

        int[] arr = {3,6,9};

        System.out.println("Array'in ilk hali : " + Arrays.toString(arr));

        arr = elementleri2Artir(arr);

        System.out.println("Array'in son hali : " + Arrays.toString(arr));




    }

    public static int[] elementleri2Artir(int[] arr){

        for (int i = 0; i < arr.length ; i++) { // indexleri kapsayacak bir loop

            arr[i] = arr[i]+2 ;
        }

        return arr;
    }
}
