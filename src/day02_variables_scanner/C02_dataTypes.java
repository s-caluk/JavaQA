

/*
Primitive DataTypes:
    boolean (1 bit , 0 yada 1),
    char (1 karakter, 8 bit)
    float(6-7 ondalikli basamak sayisi), double(15-16 ondalikli basamak sayisi),
    byte(8bit=-+128), short(16bit), int(32bit), long(64bit)

Non-Primitive DataTypes: Arrays, Strings, Classes, Interfaces, Enums, Objects, List...
Bizde bir class olusturusak o class dan obje üretiriz. O da benim tanimladigim non-primitiv datatypemdir.
Obje olusturan her kalip(class) Non-primitiv datatürüdür.

Kullanicilar primitiv data türü olusturamazlar, non-primitiv olusturabilirler.
 */


package day02_variables_scanner;

public class C02_dataTypes {

    public static void main(String[] args) {

        char karakter= 'w';  //char data türünde bir variable oluturuyorsun.
        char krk2='2';
        char krk3='$';
        //char krk4=' .'; // char data turu sadece 1 karakter kabul eder. bosluk da karakterdir.

        long sayi=75232323223L; // int´den buyuk bir degeri long variable'a atamak istersek yanina l veya L yazmaliyiz.

        byte sayi2=34;

        float sayi3= 4.567F; // java ondalikli sayilari otomatik olarak double kabul eder
        // ozellikle float kullanmak istiyorsaniz deger atamasi yaparken yanina f veya F yazmalisiniz

    }
}





