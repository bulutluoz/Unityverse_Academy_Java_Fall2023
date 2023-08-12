package day03_switchStatements_stringManipulations;

public class C07_length {

    public static void main(String[] args) {

        String str = "Arzu Uzunkavaklaraltindayataruyumazoglu";

        // son harfi yazdirin
        System.out.println(str.length()); // 40

        System.out.println(str.charAt(str.length() - 1)); // u

        // sondan 3.karakteri yazdirin

        System.out.println(str.charAt(str.length()-3));
    }
}
