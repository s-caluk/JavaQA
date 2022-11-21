
/*
if statements (bagimsiz if cümleleri) : bir sart ve ona bagli bir sonuctan olusur.
if else cümlesinde 2 durumdan sadece 1 tanesi mutlaka calisir. 1 SART 2 DURUM vardir.
 */

package day06_ifElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements {

    public static void main(String[] args) {

        /* SORU: Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
           ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ücgenin kenar uzunluklarini giriniz.");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if (kenar1 == kenar2 && kenar2 == kenar3 && kenar1>0) {
            System.out.println("Eskenar ücgen");
        }else{
            System.out.println("Eskenar degil");
        }
    }

}
