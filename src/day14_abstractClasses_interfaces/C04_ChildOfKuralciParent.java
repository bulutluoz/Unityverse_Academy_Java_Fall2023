package day14_abstractClasses_interfaces;

public class C04_ChildOfKuralciParent extends C03_KuralciParent{



    public void method2() {
        // abstract parent class'lar
        // child class'lari abstract olarak isaretlenen method'lari
        // implement etmeye zorlarlar.
        // method body'sine yani method'u nasil kullanacaklarina karismazlar

    }

    public void method1(){
        // child class'lar parent class'daki concrete method'lari
        // kendilerine ISTERLERSE uyarlayabilirler

        // parent class'lardaki concrete method'lari
        // Override etmek OPSIYONEL'dir
        // child class isterse override eder
        // isterse parent class'dan kullanir
    }
}
