package day13_methodOverloading_whileLoop;

import day11_forLoops.C07_TersineCevirme;
import day12_methodCreation.C03_AsalSayi;
import day12_methodCreation.C07_TerseCevirme;
import day12_methodCreation.C09_FibonacciSerisi;

public class C01_MethodCall {
    public static void main(String[] args) {

        // ilk 15 fibonacci sayisini yazdirin
        C09_FibonacciSerisi.fibonaccidenSayiYazdir(12); //0 1 1 2 3 5 8 13 21 34 55 89

        //asagida verilen cümleyi tersine cevirin
        String str = "Bir kere yaparim, yan gelir yatarim";
        String tersStr = C07_TerseCevirme.metniTerseCevir(str);
        System.out.println(tersStr); //miratay rileg nay ,mirapay erek riB

        // asagida verilen cumlenin palindrome olup olmadigini yazdirin
        String str2 = "Java candir";
        tersStr = C07_TerseCevirme.metniTerseCevir(str2);
        if (str.equals(tersStr)) {
            System.out.println("Palindrom");
        }else{
            System.out.println("Palindrom degil");
        }

        // asagida verilen sayinin asal sayi olup olmadigini yazdirin

        int sayi= 230;

        System.out.println(C03_AsalSayi.asalSayiMi(sayi)); // true

        // kullanici true / false dan bir sey anlamaz , acik sekilde yazalim dersek

        boolean sonuc= C03_AsalSayi.asalSayiMi(sayi); // true


        if (sonuc) {
            System.out.println("Girilen " + sayi + " asal.");
        }else {
            System.out.println("Girilen " + sayi + " asal sayi degil.");
        }
    }
}
