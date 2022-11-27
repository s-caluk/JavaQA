package day09_stringManipulations;

public class C07_ilkTest {
    public static void main(String[] args) {

        // SORU: Gittigimiz web sayfasindan aldigimiz String arama sonuclarinda
        // arama sayisinin 50'den fazla oldugunu test edin

        String input = "1-48 of 87 result for \"nutella\"";

        int indexOf = input.indexOf("of");
        int indexResult = input.indexOf("result");

        //stringin icinden alindigi icin substring de String oluyor.
        String aramaSayisiString = input.substring(indexOf+3, indexResult-1);
        System.out.println(aramaSayisiString);    //87

        //sayilari kiyaslayabilmek icin int e cevirmelisin
        int aramaSayisiInt = Integer.parseInt(aramaSayisiString);

        if(aramaSayisiInt>50) {
            System.out.println("Nutella arama testi PASSED");
        }else{
            System.out.println("istenen kadar sonuc yok, Nutella arama testi FAILED");
        }



    }
}
