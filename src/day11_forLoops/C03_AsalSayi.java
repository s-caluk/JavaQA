
/*
break yazilmazsa her bölünenen icin bsp: 20 sayisi 2,4,5,10 bölünür
4 kez if bloguna girer ve der kez sout´u yazdirir
1 kez bölünebiliyorsa zaten asal degildir. 4 kez kontrole gerek yok. bosuna calismasin.
o yüzden break kullaniliyor.

Java, bir Forloop'un icerisinde "break" gorurs o loop'u bitirir
 */

package day11_forLoops;

public class C03_AsalSayi {
    public static void main(String[] args) {
        // input olarak verilen bir tamsayinin
        // asal sayi olup olmadigini yazdirin

        int input=19;
        String sonuc= "Sayi asaldir";

        for (int i = 2; i < input ; i++) {

            if (input%i==0){
                sonuc="Sayi asal degil";
                break;
                // Java, bir Forloop'un icerisinde "break" gorurs o loop'u bitirir
            }
        }

        System.out.println(sonuc);
    }
}
