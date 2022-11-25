

/*
String manipulation: hazir metodlar kullanilarak degistirme.
String manipulation yapilirken degisikligin kalici olmasi isteniyorsa, atama yapilmalidir.
 */
        /*
           string ifadeler case sensitive'dir
           kullanicinin Pazar, PAzar, PazaR, PAZAR ... gibi 32 farkli sekilde yazma ihtimali vardir
           Kullanicinin girdigi degeri direk "kalici olarak degistirmek" tercih edilmez
           bunun yerine kullanicinin girdigi degeri degistirip yeni bir variable'a atama yapar
           ve kodlarimizda yeni variable'i kullaniriz
           Konsola yazdiracgimiz zaman, istersek kullanicin girdigi orjinal metni yazdiririz
           istersek de bizim cevirdigimiz hali yazabiliriz
         */

package day08_stringManipulation;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {
        //SORU:  Kullanicidan gunu ismini girmesini isteyin,
        // girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var”
        // seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
        // girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gün ismi giriniz");
        String str = scan.next();
        String kullanilacakGun = str.toLowerCase();

        switch (kullanilacakGun) {
            case "pazartesi":
                System.out.println( kullanilacakGun + " calisma zamani, tatile 5 gün var");
                break;
            case "sali":
                System.out.println(kullanilacakGun +" calisma zamani, tatile 4 gün var");
                break;
            case "carsamba":
                System.out.println(kullanilacakGun +" calisma zamani, tatile 3 gün var");
                break;
            case "persembe":
                System.out.println(kullanilacakGun +" calisma zamani, tatile 2 gün var");
                break;
            case "cuma":
                System.out.println(kullanilacakGun +" calisma zamani, tatile 1 gün var");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println(kullanilacakGun +" Simdi dinlenme zamani");
                break;
            default:
                System.out.println(kullanilacakGun +" yanlis gün ismi");

        }

    }
}
