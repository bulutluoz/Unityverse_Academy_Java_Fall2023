package day10_passByValue_immutable_dateTime;

public class C07_ImmutableClasses {

    public static void main(String[] args) {

        String  str = "java candir";

        System.out.println(str); // java candir

        System.out.println(str.toUpperCase()); // JAVA CANDIR





        str = str.substring(0,4);

        System.out.println(str); // java


        str = str.toUpperCase();

        System.out.println(str); // JAVA


        for (int i = 0; i <=100 ; i++) {

            str += ".";
        }

        System.out.println(str);
    }
}
