package day07_ternary_switchStatements;

public class C06_Sorular {
    public static void main(String[] args) {

        //SORU: Kullanicidan notunu alin 50 veya daha büyükse "sinifi gectin"
        // 50 den kücükse "maalesef kaldin" yazdirin.

        int input = 44;
        System.out.println( input >= 50 ? "sinifi gectin" : "Maalesef kaldin");

        /*
        SORU: Kullanicidan bir harf isteyin, harf kücükse büyük harfe cevirin,
        yoksa girilen harfi yazdirin.
         */

        char karakter ='a';
        System.out.println(karakter>='a' && karakter<='z' ? (char)(karakter-32) : karakter);

        /*
        Kullanicidan bir sayi alin ve mutlak degeri yazdirin.
        |5| = 5 , |-4| = (-1) * (-4) = 4
         */

        input = -5 ;
        System.out.println(input>0 ? input : (-1)*input);

    }
}
