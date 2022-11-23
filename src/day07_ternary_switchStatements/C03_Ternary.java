
//ternary basit kodlar icin kullanilir. if else ile daha komplex kodlar yazilir.
//ternary bir sonuc döndürdügü icin; ya yazdirmali ya da bir variableye atamalisiniz!

package day07_ternary_switchStatements;

public class C03_Ternary {
    public static void main(String[] args) {

        /*
        input olarak verilen sayiyi kontrol edip
        sayi cift ise -> "cift sayi" degilse "tek sayi" yazdirin.
         */

        // if-else ile yapalim
        int input = 33;
        if (input % 2 == 0) {
            System.out.println("cift sayi");
        } else {
            System.out.println("tek sayi");
        }

        // ternary ile yapalim
        System.out.println(input % 2 == 0 ? "cift sayi" : "tek sayi");

    }
}
