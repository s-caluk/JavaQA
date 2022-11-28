
//replace bir String metodudur

package day10_stringManipulations;

public class C02_replace {
    public static void main(String[] args) {

        String str = "Java ogren, adana ye :)";

        System.out.println(str.replace("a", "A"));
        System.out.println(str.replace(" ", ""));
        System.out.println(str.replace("Java", "Yazilim"));

        String telefon = "555 34512346788";
        System.out.println(telefon.replace("5", "22"));

        //asagidaki arama sonucunun 10.000 den fazla oldugunu test edin

        String sonuc = "1-16 of over 100,000 results for \"apple\"";
        int indexOver = sonuc.indexOf("over");
        int indexResult = sonuc.indexOf("result");

        String sonucSayisi = sonuc.substring(indexOver+5, indexResult-1);
        System.out.println(sonucSayisi); //100,000

        sonucSayisi = sonucSayisi.replace(",","");
        System.out.println(sonucSayisi);  //100000

        int sonucSayisiInt = Integer.parseInt(sonucSayisi); //string 100000´i integere cevirdi

        if (sonucSayisiInt>100000) {
            System.out.println("arama sonuc testi PASSED");
        }else{
            System.out.println("arama sonuc testi FAILED");
        }

    }
}
