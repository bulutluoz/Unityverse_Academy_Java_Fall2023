package day14_abstractClasses_interfaces;

public class C11_ChildOfI04 implements I04_InterfaceBodysiOlanMethod{


    public void method1() {

    }

    public void method2() {

    }

    public void method3() {

    }

    public static void method4(){
        // parent class'daki method4 abstract olmadigindan implement edilmez
        // parent class'daki method4 static oldugu icin override da edilemez
        System.out.println("child class static method 4");
    }


    public static void main(String[] args) {

        method4(); // child class static method 4
        I04_InterfaceBodysiOlanMethod.method4(); // Interface static method4
    }
}
