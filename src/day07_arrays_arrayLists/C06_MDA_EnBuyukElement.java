package day07_arrays_arrayLists;

public class C06_MDA_EnBuyukElement {
    public static void main(String[] args) {

        int[][] arr = {{2,4,6},{1,2,13,4},{1,6},{5}};

        // array'deki en buyuk elementi yazdirin

        int enBuyukSayi = arr[0][0];

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j] > enBuyukSayi){

                    enBuyukSayi = arr[i][j];
                }
            }
        }

        System.out.println("Array'deki en buyuk sayi : " + enBuyukSayi);
    }
}
