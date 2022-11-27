package day09_stringManipulations;

import java.util.Scanner;

public class C06_indexOf {
    public static void main(String[] args) {
        /*
        SORU: kullanicidan aldigimiz cumle "cok" ile baslayan ilk kelimeyi yazdirin
        cumlede cok kelimesi gecmiyorsa "cumlede cok ile baslayan kelime yok" yazdirin
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String girilenCumle = scan.nextLine();

        if(!girilenCumle.contains("cok")){
            System.out.println("cümlede cok ile baslayan bir kelime yok");
        }else{
            int cokIndex = girilenCumle.indexOf("cok");
            int boslukIndex = girilenCumle.indexOf(" " , cokIndex+1);
            System.out.println(girilenCumle.substring(cokIndex, boslukIndex));
        }




    }
}
