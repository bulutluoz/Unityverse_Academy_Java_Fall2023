package day12_inheritance;

public class I_Parent extends H_GParent{
    String strParent = "Parent";
    String str = "ParentStr";

    I_Parent(){

        System.out.println("parent parametresiz constructor");
    }

    I_Parent(int sayi){
        super("Hava");
        System.out.println(strParent);
        this.strParent = "En Yeni parent";
        System.out.println("parent int parametreli constructor");
    }

    I_Parent(String str){

        strParent = "Yeni parent";
        System.out.println("parent String parametreli constructor");
    }
}
