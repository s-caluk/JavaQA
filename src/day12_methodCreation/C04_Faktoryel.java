
/*
her variable kendi cöplügünde öter.
input ve sayi gibi baska variable isimleri verebiliriz. istersek ayni ismi de verebiliriz.
fakat sayi´yi main tanimaz. inputu faktoriyalYazdir methoduda input variablesini tanimaz
 */


package day12_methodCreation;

import java.sql.SQLOutput;

public class C04_Faktoryel {
    public static void main(String[] args) {
        // verilen bir sayinin 15'den kucuk bir pozitif tamsayi oldugunu kontrol edin
        // kucukse bir method olusturup, faktoryel degerini yazdirin
        // sayi istenen aralikta degilse uyari yazdirin

        int input= 10;

        if(input > 0 && input <15) {
            faktoriyelYazdir(input);
        }else {
            System.out.println("input 15´den kücük pozitif tam sayi olmalidir");
        }


    }

    public static void faktoriyelYazdir(int sayi){

        int faktoriyelSonucu = 1;
        for (int i = sayi; i >=1 ; i--) {
            faktoriyelSonucu *= i;  // her loop´da gelen sayiyi onceki deger ile carpalim
        }
        System.out.println("Girilen "+sayi+" icin faktoriyel: "+faktoriyelSonucu);
    }


}
