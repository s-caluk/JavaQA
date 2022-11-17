/*
Isim verme Kurallari:
Variable ismi olarak buyuk yada kucuk harf yazmaniza java karismaz ancak naming convention soyledir;
variable isimleri kucuk harfle baslar ve devam eder ancak birden fazla kelime kullanilacaksa,
sonraki kelimelerin ilk harfleri buyuk harf olur buna CamelCase denir

-variable isimleri büyük kücük harf duyarlidir
-variable isimleri bosluk yada özel karakterler kabul etmez ( _ ve $ istisna )
-harfle baslamali, rakam kabul etmez
-variable isimleri keyword olamaz
-birden fazla isim olacak camelCase kullanilir
 */

package day02_variables_scanner;

public class C04_NamingConvention {
    public static void main(String[] args) {

        String str= "java ogrenmek cok zevkli";

        System.out.println(str);     //Str STr STR olmaz

        int sinifMevcudu3_$ = 23;    //_ ve $ isareti alabilir

        // int while = 45;

        int SAYI= 24;                // olur ama camelCase uygun degil


    }
}
