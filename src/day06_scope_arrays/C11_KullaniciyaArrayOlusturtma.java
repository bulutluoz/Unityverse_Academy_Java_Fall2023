package day06_scope_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C11_KullaniciyaArrayOlusturtma {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip
        //        array’i olusturan ve bize donduren bir method olusturun.

        int[] arr = intArrayOlustur();
        System.out.println(Arrays.toString(arr));


    }


    public static int[] intArrayOlustur(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen olusturulacak array'in uzunlugunu girin");

        int arrLength = scanner.nextInt();

        int[] arr = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {

            System.out.println("Lutfen array icin element degeri giriniz");
            arr[i] = scanner.nextInt();
        }

        return arr;
    }
}
