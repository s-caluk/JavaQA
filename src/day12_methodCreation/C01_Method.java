

/* metodlar bazen cok basit islemleri, bazen de komplex islemleri yapabilir
biz o metodlari nasil yapabiliriz diye düsünmek yerine hazir methodu kullanmayi
tercih ederiz.bizden sonra kodu inceleyecek kisilerde method isimlerinden
ne yapmak istedigimizi anlayabilirler. Ayrica kodu her yazdigimizda
yapabilecegimiz muhtemel hatalardan kurtulmus oluruz.

sonucu returnle döndürdükten sonra istersem yazdirabilirim, istersem atama ile yine kullanabilirim.
ama void le yazdirdiktan sonra döndüremem.
o yüzden return, metodlarda daha tercih edilir.
 */

package day12_methodCreation;

public class C01_Method {
    public static void main(String[] args) {

        String str = "Java da yolu yariladik";

        str.isEmpty(); //boolean sonuc döndü ama kullanmadik

        //1)methodun döndürdügü sonucu kullanmak isterseniz ya yazdirirsiniz (void)
        System.out.println(str.isBlank());

        //2)ya da sonucu ileride kullanacaksak atama yaparsiniz, sonra istersen yazdirirsin (int,String)
        String buyukHarfStr = str.toUpperCase();
    }
}
