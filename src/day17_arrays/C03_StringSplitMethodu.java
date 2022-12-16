package day17_arrays;

import java.util.Arrays;

public class C03_StringSplitMethodu {
    public static void main(String[] args) {

        String str = "Java her gecen gün güzellesiyor";

        /*str´da kac kelime var?
        split methodu istedigimiz stringi istedigimiz ayiraci kullanarak parcalara ayirmamiza imkan verir

         */

        String[] spaceSplit = str.split(" ");
        System.out.println(Arrays.toString(spaceSplit)); //yeni bir array elde etmis olduk
        System.out.println("verilen cümledeki kelime sayisi: " + spaceSplit.length);

        System.out.println(Arrays.toString(str.split("e"))); //e´den split etsin:[Java h, r g, c, n gün güz, ll, siyor]
        System.out.println(Arrays.toString(str.split("gün"))); //[Java her gecen ,  güzellesiyor]
        System.out.println(Arrays.toString(str.split(""))); //[J, a, v, a,  , h, e, r,  , g, e, c, e, n,  , g, ü, n,  , g, ü, z, e, l, l, e, s, i, y, o, r]

        //hiclikle bölersen her carakteri arraye atiyor.
        //bir cümlenin elementlerini substring ile bölüp , üzerinde oynamak istemiyorsan
        //hiclikle arraye cevirip o sekilde islemlerini yapabilirsin

    }
}
