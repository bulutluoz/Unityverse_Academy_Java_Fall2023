package day07_arrays_arrayLists;

public class C04_MultiDimensionalArrays {

    public static void main(String[] args) {

        int[][] arr = {{2,4,6},{1,2,3,4},{1,6},{5}};

        System.out.println(arr.length); // 4

        System.out.println(arr[1].length); // 4

        System.out.println(arr[3]); // [I@2752f6e2

        System.out.println(arr[0][2]); // 6

        System.out.println(arr[1][2]); // 3

    }
}
