
/*
SORU: Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.
 */

package day02_variables_scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int tamSayi = scan.nextInt();
        System.out.println("Lutfen bir ondalikli sayi giriniz");
        double ondalikliSayi = scan.nextDouble();

        System.out.println("Sayilarin toplami: " + (tamSayi+ondalikliSayi)); //paranteze almazsan hata veriyor
        System.out.println("Sayilarin carpimi: " + tamSayi*ondalikliSayi);

    }
}
