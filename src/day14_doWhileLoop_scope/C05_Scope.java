
/*
Scope konusu ; olusturdugumuz variablelere nereden ulasabiliriz.
 */

package day14_doWhileLoop_scope;

/*
1) Local variableler : localde static kullanilamaz.
2) Class level variableler : static keywordune göre erisimleri degisir.
kivircikda tanimlanan kivircikda kalir
*/

public class C05_Scope {

     int sayi = 10;
     static int number;

    public static void main(String[] args) {
        String mainStr = "Java";
        number = 10 ;
        // sayi = 20;   // burda kullanamiyorsun sayiyi
        //System.out.println(nethod2Str);

        for (int i = 0; i < 10 ; i++) {
            int toplam = i;
        }

        // System.out.println(toplam); toplama ulasamazsin. Loopun icinde olusturulan loopda kalir

    }
    public static void method1(){
        String method1Str = "Güzeldir";
        number = 20 ;
        //sayi = 20;
        //System.out.println(mainStr);
        //System.out.println(nethod2Str);

    }
    public void method2(){
        String method2Str = "Candir";
        number = 30;
        sayi = 20;
        //System.out.println(mainStr);
    }

}
