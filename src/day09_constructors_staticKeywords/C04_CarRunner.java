package day09_constructors_staticKeywords;

public class C04_CarRunner {

    public static void main(String[] args) {

        C03_Car car = new C03_Car("Bmw");
        method1();

    }

    public static void method1(){
        System.out.println("method1 calisti");
        method2();
    }

    public static void method2(){
        System.out.println("method2 calisti");
    }

    public static void method3(){
        System.out.println("method3 calisti");
    }
}
