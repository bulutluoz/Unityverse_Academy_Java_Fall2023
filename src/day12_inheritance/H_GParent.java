package day12_inheritance;

public class H_GParent {

    String strGP = "Grand Parent";

    H_GParent(){
        System.out.println("Grandparent parametresiz constructor");
    }

    H_GParent(int sayi){
        System.out.println("Grandparent int parametreli constructor");
    }

    H_GParent(String str){
        System.out.println("Grandparent String parametreli constructor");
    }
}
