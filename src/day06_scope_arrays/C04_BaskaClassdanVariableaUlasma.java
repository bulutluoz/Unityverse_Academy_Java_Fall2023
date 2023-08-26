package day06_scope_arrays;

public class C04_BaskaClassdanVariableaUlasma {


    public static void main(String[] args) {

        // baska class'daki static variable'lara
        // ulasmak icin classIsmi.staticVariableIsmi
        // yazmak yeterlidir

        System.out.println(C03_InstanceVariables.sayiStatic); // 20

        // baska class'daki instance variable'lara
        // ulasmak icin o class'dan bir obje olusturmalisiniz

        C03_InstanceVariables obj = new C03_InstanceVariables();

        System.out.println(obj.sayiInstance); // 30


    }
}
