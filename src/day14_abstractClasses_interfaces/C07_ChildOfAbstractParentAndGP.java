package day14_abstractClasses_interfaces;

public class C07_ChildOfAbstractParentAndGP extends C06_AbstractParent{

    /*
        Abstract class'in abstract child class'lari olabilir

        bir abstract child, parent'i olan abstract class'daki
        abstract method'lari kendisine uyarlamak ZORUNDA DEGILDIR
           - isterse kendisine uyarlayip concrete'lestirir
           - isterse hic bir islem yapmayabilir

        Abstract bir zincirden (parent - grandparent - ...)sonra gelen
        ILK CONCRETE class parent abstract class'lardaki
        concrete'lestirilmeyen TUM abstract method'lari
        kendisine implement etmek ZORUNDADIR
     */

    public void method1() {
        System.out.println("C07_ChildOfAbstractParentAndGP method1");
    }

    public void method2(){
        System.out.println("C07_ChildOfAbstractParentAndGP method2");
    }

    public void method3() {
        System.out.println("C07_ChildOfAbstractParentAndGP method3");
    }


    public static void main(String[] args) {

       C07_ChildOfAbstractParentAndGP obj = new C07_ChildOfAbstractParentAndGP();

       obj.method1(); // C07_ChildOfAbstractParentAndGP method1
       obj.method2(); // C07_ChildOfAbstractParentAndGP method2
       obj.method3(); // C07_ChildOfAbstractParentAndGP method3
       obj.method4(); // GP'daki abstract method'u concrete'lestirdim

    }
}
