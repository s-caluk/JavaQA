
/*
iki tarih arasindaki farki bulmak istiyorsan periodu kullanabilirsin.


 */
package day23_dateTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {

        LocalDate dogumTarihi= LocalDate.of(1982,6,22);
        LocalDate bugun= LocalDate.now();

        Period yas = Period.between(dogumTarihi,bugun);

        System.out.println(yas); // P40Y6M21D
        System.out.println(yas.getYears()); // 40

        LocalDate baslangic=LocalDate.of(2001,2,5);
        LocalDate bitis= LocalDate.of(2009,12,20);

        Period okulSure= Period.between(baslangic,bitis);
        System.out.println(okulSure); // P8Y10M15D
    }
}