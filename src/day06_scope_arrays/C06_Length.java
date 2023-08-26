package day06_scope_arrays;

import java.util.Arrays;

public class C06_Length {

    public static void main(String[] args) {

        String str = "java java java";

        System.out.println(str.length()); // 14

        // string'deki son karakteri yazdirin

        System.out.println(str.charAt(str.length()-1)); // a


        int[] arr = {4,1,7,9,3};
        System.out.println(arr.length); // 5

        // son elementi yazdirin

        System.out.println(arr[arr.length-1]); // 3


        // Tum elementleri yazdirin

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
        // 4 1 7 9 3

        // Array'i yazdirin
        System.out.println(arr); // [I@6bf256fa
        System.out.println(Arrays.toString(arr)); // [4, 1, 7, 9, 3]

    }
}
