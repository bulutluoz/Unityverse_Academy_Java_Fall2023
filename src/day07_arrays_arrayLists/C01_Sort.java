package day07_arrays_arrayLists;

import java.util.Arrays;

public class C01_Sort {

    public static void main(String[] args) {

        // Verilen int bir array'de tekrar eden element olup olmadigini
        // true veya false olarak bize donduren bir method olusturun

        int[] arr = {3,1,6,8,0,1,4,2,3};

        System.out.println(tekrarVarmi(arr)); // true

        int[] arr2 = {3,5,7,8,1,9,0,2};
        System.out.println(tekrarVarmi(arr2)); // false
    }

    public static boolean tekrarVarmi(int[] arr){

        Arrays.sort(arr); // [0, 1, 1, 2, 3, 3, 4, 6, 8]
        boolean sonuc = false;

        for (int i = 0; i < arr.length-1 ; i++) {

            if (arr[i] == arr[i+1]){
                sonuc =true;
                break;
            }

        }
        return sonuc;
    }
}
