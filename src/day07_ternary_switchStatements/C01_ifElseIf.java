


package day07_ternary_switchStatements;

import java.util.Scanner;

public class C01_ifElseIf {
    public static void main(String[] args) {

        /*
        kulanicidan bir tam sayi alin.
        Sayi rakam ise -> "girilen sayi rakam"
        sayi 2 basamakli ise -> "girilen sayi 2 basamakli"
        sayi 2 basamaktan büyükse -> "büyük sayi yazdirin"
         */

        /*
        Eger if-else cümleleri else ile bitmiyorsa tüm durumlari kapsamaz
        yani bazi degerler icin hic bir if body si calismayabilir.
        Bu tür sorulari cözerken sartlarin tamamini dikkatli yazmak gerekiyor.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int girilenSayi = scan.nextInt();

        if(0<=girilenSayi && girilenSayi<=9) System.out.println("girilen sayi rakam");
        else if (10<=girilenSayi && girilenSayi<=99) System.out.println("girilen sayi 2 basamakli");
        else if (girilenSayi>=100) System.out.println("Büyük sayi");


    }
}
