package day12_inheritance;

public class J_Child extends I_Parent{

    String strChild = "Child";

    J_Child(){

        System.out.println("Child parametresiz constructor");
    }

    J_Child(int sayi){

        System.out.println("Child int parametreli constructor");
    }

    J_Child(String str){

        System.out.println("Child String parametreli constructor");
    }
}
