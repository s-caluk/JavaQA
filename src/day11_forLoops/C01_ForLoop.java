
/*
normalde char karakterler matematiksel islemlere girince
ascii tablosundaki sayi ile islemini yaptirir.
a=97
 */
package day11_forLoops;
import java.util.Scanner;
public class C01_ForLoop {
    public static void main(String[] args) {

        // kullanicidan bir char alip
        // o karakterden sonra gelen 10 karakteri yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenKarakter=scan.next().charAt(0);

        for (int i = 1; i <=10 ; i++) {
            System.out.print((char)(girilenKarakter + i) + " ") ; //sayiyi char´a dönüstürdü

        }
    }
}
