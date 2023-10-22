package day13_inheritance;

public class H_DataTuruKullanimiOzet {

    /*

        Eger bir obje olusturulurken
            - Data turu ve Constructor ayni ise
                o class'a gider ilk buldugumuz variable/method'u kullaniriz
                bulamazsak CTE olur

            - Data turu ve constructor farkli ise
                Aramaya data turunun oldugu class'dan baslariz
                    - Eger aradigimiz method/variable yoksa CTE olur
                    - aradigimiz ozelligi bulursak
                        - ozellik variable ise buldugumuzu kullaniriz
                        - ozellik method ise ONCE constructor'a kadar
                          daha guncel bir method var mi diye kontrol ederiz
                          ve en guncel method'u kullaniriz
     */
}
