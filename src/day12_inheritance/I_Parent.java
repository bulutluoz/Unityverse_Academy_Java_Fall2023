package day12_inheritance;

public class I_Parent extends H_GParent{
    String strParent = "Parent";

    I_Parent(){

        System.out.println("parent parametresiz constructor");
    }

    I_Parent(int sayi){

        System.out.println("parent int parametreli constructor");
    }

    I_Parent(String str){

        System.out.println("parent String parametreli constructor");
    }
}
