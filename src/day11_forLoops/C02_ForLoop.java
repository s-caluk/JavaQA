
/*
karakteri charAt yada substring ile alabiliyorduk!
substring ile toLower/UpperCase kullanilabiliyor.
 */


package day11_forLoops;

public class C02_ForLoop {
    public static void main(String[] args) {
        // input olarak verilen bir Stringde
        // index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle yazdirin
        // ornek : Java  output: JaVa

        String str = "Java candir, Selenium heyecandir." ;

        for (int i = 0; i <str.length() ; i++) {
            System.out.print( i%2==0            //kod basitse ternary daha pratik
                                ? str.substring(i,i+1).toUpperCase()
                                : str.substring(i,i+1).toLowerCase() );

        }

    }
}
