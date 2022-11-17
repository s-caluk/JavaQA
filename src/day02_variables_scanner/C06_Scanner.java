
/*
 Kullanicidan deger almak icin 3 islem yapmamiz gerekir!
 bize Scanner lazim dedik, java da Scanner aletcantasini/kütüphanesini bize otomatik import etti.
 */

package day02_variables_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        //SORU:  Kullanicidan bir sayi isteyin ve sayinin karesini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Karesini almak istediginiz sayiyi giriniz.");
        double girilenSayi = scan.nextDouble();

        System.out.println("Karesi: "+girilenSayi*girilenSayi);

    }
}


