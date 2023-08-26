package day06_scope_arrays;

public class C03_InstanceVariables {

    static int sayiStatic = 20;
    int sayiInstance = 30;


    public static void main(String[] args) {

        System.out.println(sayiStatic);

        // sayiInstance = 40;
        C03_InstanceVariables obj = new C03_InstanceVariables();
        System.out.println(obj.sayiInstance); // 30

    }


    public static void method1(){
        System.out.println(sayiStatic);

        C03_InstanceVariables obj2 = new C03_InstanceVariables();
        System.out.println(obj2.sayiInstance);

    }


    public void method2(){
        System.out.println(sayiStatic);
        sayiInstance = 40;
    }
}
