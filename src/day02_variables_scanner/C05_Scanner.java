/*
Java’da her method calistiginda, o methoda ait bir stack ve ona ait bir stack memory
alani olusturulur. Ayrica her method’un kullandigi heap memory vardir.

Stack memory’de; primitive data turundeki variable’lar ve degerleri ile non-primitive
data turundeki variable’larin referanslari olurken,

heap memory’de; non-primitive variable’larin degerleri store edilir.

Bsp=> String str1; ( str1 stack memorye yazilir, adres/pointer özelligi görür, henüz degeri yok)
str1 = "Java güzeldir" ( deger kismi "Java güzeldir" heap memory e yazilir)

 */

package day02_variables_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //SORU:  Kullanicidan ismini alin ve girilen ismi buyuk harflerle yazdirin.

        Scanner scan = new Scanner(System.in);     //1. adim: scanner objesi olusturmak
        System.out.println("Isminizi yaziniz.");   //2. adim: hangi veriyi istiyorsun
        String girilenIsim = scan.nextLine();      //3. adim: degeri kaydedeceginiz bir variable olusturun

        System.out.println(girilenIsim.toUpperCase());

    }
}




