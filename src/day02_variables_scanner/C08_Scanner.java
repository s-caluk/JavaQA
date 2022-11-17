
/*
SORU: Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini yazdirin.
*/

package day02_variables_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdorgenin iki kenar uzunlugunu girin");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();

        System.out.println("Diktortgenin alani : " + kenar2*kenar1);


    }
}
