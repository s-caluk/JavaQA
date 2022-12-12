package day13_methodOverloading_whileLoop;

import java.util.Random;
import java.util.Scanner;

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
        int sayac = 1;
        int tahmin = 0;

        Scanner scan = new Scanner(System.in);

        while(tutulanSayi != tahmin){

            System.out.println("Lutfen bir tahmin giriniz");
            tahmin= scan.nextInt();

            if (tutulanSayi==tahmin){ // sayiyi bulduysa
                System.out.println(sayac +" tahmin ile tuttugum sayiyi buldun");
                if (sayac<=3){
                    System.out.println("Vaowww");
                } else if (sayac<=8) {
                    System.out.println("Aferin");
                }else {
                    System.out.println("Basarisiz");
                }
                break;
            } else if (tahmin<tutulanSayi) {
                System.out.println("Sayiyi buyut");
                sayac++;
            }else {
                System.out.println("Sayiyi kucult");
                sayac++;
            }
        }
    }
}
