
/*
        SORU:Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.

		Isminiz : John
		Soyisminiz : Doe
		Yasiniz : 44
		Kaydiniz basariyla tamamlanmistir.
*/

package day02_variables_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String girilenIsim = scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String girilenSoyisim = scan.nextLine();
        System.out.println("Lütfen yasinizi giriniz");
        int girilenYas = scan.nextInt();

        System.out.println("Isminiz: "+ girilenIsim +
                           "\nSoyisminiz: " + girilenSoyisim +
                           "\nYasiniz: " + girilenYas +
                           "\nKaydiniz basari ile tamamlanmistir."
        );
    }
}


