package day14_abstractClasses_interfaces;

public interface I01_Interface {

    // Interface'lerde tum variable'lar public, static ve final'dir.
    // Java'da public,static,final variable isimleri buyuk Harf ile yazilir
    // Interface'lerdeki variable'lari da bu sekilde isimlendirebiliriz

    int SAYI = 10;
    public int SAYI2 = 20;
    public static String ISIM = "Java";
    public static final boolean IS_TRUE = true;

    // void method1(){}
    // Interface abstract methods cannot have body

    void method2();
    abstract void method3();

    // protected abstract  void method4();
    // Modifier 'protected' not allowed here

    public abstract void method5();
    // Modifier 'public' is redundant for interface members
    // Modifier 'abstract' is redundant for interface methods

    // Interface'lerde tum method'lar PUBLIC ve ABSTRACT'dir
    // farkli bir access modifier secemeyiz
    // public ve abstract keyword'lerini yazmak ile yazmamak arasinda FARK YOKTUR
}
