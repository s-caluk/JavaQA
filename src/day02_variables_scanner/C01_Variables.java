
/*
       Java'da kodlarimizi class'larda olustururuz
       Class'lar ihtiyac duyuldugunda obje olusturmak icin de kullanilir
       Java'nin baslangic noktasi(entry point) main method'dur
       variable'lari datalarimizi saklamak (store) icin olustururuz
*/

package day02_variables_scanner;

public class C01_Variables {

    public static void main(String[] args) {

        System.out.println("Java Candir");

        String          ogrenciIsmi             =             "Matrix      .";
        //Data turu     variable ismi       assignment(atama)    deger

        System.out.println(ogrenciIsmi);    // Matrix      .

        ogrenciIsmi="Tayfur";

        System.out.println(ogrenciIsmi);    // Tayfur
    }
}

