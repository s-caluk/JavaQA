

/*
müdahale(explicit) ile kapasiteyi daraltma. sorumlulugu aliyorum sen yinede kücük olana cevir diyorsun.
Explicit narrowing yapildiginda data kayiplari veya datanin beklenmedik bir sonuca donusmesi mumkundur
 */

package day03_dataCasting_matematikselIslemler;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        double dbl= 23.5;

        int sayi= (int)dbl;
        System.out.println(sayi); // 23 , datanin bir kismi kayboldu!

        byte byt= (byte)sayi;

        System.out.println(byt); // 23

        sayi=130;
        byt=(byte)sayi; // int daha kapsamli oldugu icin otomatik atama yapmaz, bizden mudahale ister

        System.out.println("int 130'un byte hali :"+byt); //  -126

        sayi=256;
        byt=(byte)sayi; // int daha kapsamli oldugu icin otomatik atama yapmaz, bizden mudahale ister

        System.out.println("int 256'in byte hali :"+byt); //  0

        sayi=13000;
        byt=(byte)sayi; // int daha kapsamli oldugu icin otomatik atama yapmaz, bizden mudahale ister

        System.out.println("int 13000'un byte hali :"+byt); //  -56


    }
}



