
/*
SORU : Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).
       kullanicinin girdigi degerler
       sayi1= 10  sayi2=20 ise
       siz kod ile bunlarin degerlerini degistirip
       sayi1=20  sayi2=10 yapin

*/


package day02_variables_scanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sayi1 giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Lütfen sayi2 giriniz");
        int sayi2 = scan.nextInt();

        int temp;          //bos kova gibi düsün

        temp=sayi2;        // 1. adim: sayi2 degerini temp'e atayalim

        sayi2=sayi1;       // 2. adim: sayi1 degerini sayi2'ye atayalim

        sayi1=temp;        // temp'deki degeri sayi1'e atayalim

        System.out.println("sayilarin degerini yer degistirdim"
                + "\nsayi1'in yeni degeri : " + sayi1
                + "\nsayi2'nin yeni degeri : " +sayi2);


    }
}
