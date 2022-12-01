package day13_methodOverloading_whileLoop;

import java.util.Random;

public class C07_BasitOyun {
    public static void main(String[] args) {

        /*
        random olarak 1 ile 100 arasinda bir sayi olusturun
        kullanicidan bu sayiyi bilmesini isteyin
        kullanici her deger girdiginde
        tuttugumuz sayi ile karsilastirip tahminini büyül veya kücült diyelim
        kullanici tuttugumuz sayiyi bildiginde
        - 3 veya daha az bildiyse "Vaowww" yadirilim
        - 4-8 tahminde bildiyse "Aferin" yazdiralim
        - daha fazla tahminde bildiyse "basarisiz" yazdirin

        pazartesi ödevidir
         */

        Random rnd = new Random();
        int tutulanSayi = rnd.nextInt(100);

    }
}
