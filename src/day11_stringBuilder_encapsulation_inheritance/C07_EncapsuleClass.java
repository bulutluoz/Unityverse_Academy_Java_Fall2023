package day11_stringBuilder_encapsulation_inheritance;

public class C07_EncapsuleClass {





    private int satisGirisi;
    private int toplamSatisTutari;


    private int kapiNumarasi = 20;
    public String sirketIsmi = "Yildiz Triko";


    public void setSatisGirisi(int satisGirisi) {

        this.satisGirisi = satisGirisi;

        toplamSatisTutari += this.satisGirisi;
    }


    public int getToplamSatisTutari() {

        return toplamSatisTutari;

    }

    public int getKapiNumarasi() {
        return kapiNumarasi;
    }

    public void setKapiNumarasi(int kapiNumarasi) {
        this.kapiNumarasi = kapiNumarasi;
    }
}
