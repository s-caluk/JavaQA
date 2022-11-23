
/*
Ternary isleminin sonucunu "yazdiracaksak" ; boolean sartin true veya false olmasi durumunda
yazdiracagimiz datalar farli data türünde olabilir.

Ancak "atama yapacaksak" ; true veya false olmasi durunda alacagi degerler
atacagim variable´in data türüne uygun olmalidir.
 */


package day07_ternary_switchStatements;

public class C05_Ternary {
    public static void main(String[] args) {

        int sayi=12;
        System.out.println(sayi>10 ? "büyük sayi" : sayi+2 );

        // int b = sayi>10 ? "büyük sayi" : sayi+2 ;       true olursa data türü uygun degil
        // String c = sayi>10 ? "büyük sayi" : sayi+2 ;    false olursa data türü uygun degil
    }
}
