
/*
primitive data turlerinin hazir method'lari yoktur, sadece deger icerir.
non-primitive data turleri hem deger icerir hem de onceden hazirlanmis method'lari olur.

pri: kullanabilmek icin deger atanmalidir.
non-pri : deger atanmadan null olarak isaretlenebilir.

pri: kücük harfle baslar. int, char, double....
non-pri: büyük harfle baslar. String, Array...

pri: degeri büyük yada kücük farketmez, hafizada kapladiklari alan sabittir. char:8 bit gibi
non-pri: hafizada kapladiklari alan sabit degildir.data türüne ve icerigine göre farkli alan kaplar.

 */

package day02_variables_scanner;

public class C03_NonPrimitiveDataTypes {
    public static void main(String[] args) {

        String str = "Java Candir";    //non-primitiv
        int sayi = 10;                 //primitiv

        System.out.println(sayi);                //10
        System.out.println(str.toLowerCase());   //java candir
        System.out.println(str);                 //Java Candir
        System.out.println(str.toUpperCase());   //JAVA CANDIR
        System.out.println(str.isEmpty());       //false
    }
}
