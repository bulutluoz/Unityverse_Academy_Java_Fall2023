package day06_scope_arrays;

public class C05_Arrays {

    public static void main(String[] args) {

        int[] arr = {2,44,7,1,14};

        // eleman olan 44'u yazdirin
        System.out.println(arr[1]);  // 44

        // 2.index'deki elementin degerini 20 yapin
        arr[2] = 20;

        // tum elementleri yazdirin

        for (int i = 0; i <=4 ; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        String[] isimler = {"Cem","Arda"} ;

        System.out.println(isimler[0]);



    }
}
