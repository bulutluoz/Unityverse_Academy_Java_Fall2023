package day14_abstractClasses_interfaces;

public abstract class C06_AbstractParent extends C05_AbstractGrandparent{

    public abstract void method2();

    public abstract void method3();

    public void method4(){
        System.out.println("GP'daki abstract method'u concrete'lestirdim");
    }

    // public final abstract void method5();
    // Illegal combination of modifiers: 'final' and 'abstract'
    // final ==> override edilemez demek , abstract ==> mutlaka override edilecek demek


    // private abstract void method6();
    // Illegal combination of modifiers: 'abstract' and 'private'
    // abstract ==> mutlaka override edilecek
    // private method'lar class disindan kullanilamayacagi icin override edilemez
}
