


package day07_ternary_switchStatements;

import java.util.Scanner;

public class C02_IfElseIf {

    public static void main(String[] args) {
        /*
        kulanicidan bir tam sayi alin.
        sayi negatif sayi ise -> "negatif sayi"
        Sayi rakam ise -> "girilen sayi rakam"
        sayi 2 basamakli ise -> "girilen sayi 2 basamakli"
        sayi 2 basamaktan büyükse -> "büyük sayi yazdirin"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int girilenSayi = scan.nextInt();

        if(girilenSayi<0) System.out.println("Negatif sayi");
        else if (girilenSayi<=9) System.out.println("Girilen sayi rakam");
        else if (girilenSayi<=99) System.out.println("Girilen sayi 2 basamakli");
        else System.out.println("Büyük sayi");

    }
}
