package day14_abstractClasses_interfaces;



public class C09_ChildOfInterface1ve2 extends C01_KlasikParent implements I02_Interface1,I03_Interface2{


    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(SAYI); // 20
        System.out.println(S); // 30

        // System.out.println(ISIM);
        // ISIM variable'i iki farkli interface'de oldugundan, Java hangisini kullanacagini bilmiyor
        // bu durumda hangisini kullanmasini istedigimizi belirtmemiz lazim
        System.out.println(I02_Interface1.ISIM); // ALI
        System.out.println(I03_Interface2.ISIM); // VELI
    }
}
