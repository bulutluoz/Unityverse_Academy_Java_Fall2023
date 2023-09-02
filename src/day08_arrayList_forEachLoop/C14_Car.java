package day08_arrayList_forEachLoop;

public class C14_Car {

    String marka = "Marka degeri atanmamis";
    String model = "Model atanmamis";
    String renk ;
    int yil = 1900;
    int ilanNo = 1000;


    @Override
    public String toString() {
        return "Car Ozellikleri {" +
                "marka:'" + marka + '\'' +
                ", model:'" + model + '\'' +
                ", renk:'" + renk + '\'' +
                ", yil:" + yil +
                ", ilanNo:" + ilanNo +
                '}';
    }

    public void maxHiz(){
        System.out.println("tum toyota araclarin max hizi 240");
    }
}
