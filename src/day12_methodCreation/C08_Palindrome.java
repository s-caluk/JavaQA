package day12_methodCreation;

public class C08_Palindrome {

    public static void main(String[] args) {

        // Verilen bir String'in palindrome olup olmadigini yazdirin
        // Palindrome : duz okunusu ile tersten okunusu birbirine ayni olan

        String str = "madam";   //madam dene
        String tersStr = C07_TerseCevirme.metniTerseCevir(str);

        if (str.equals(tersStr)) {
            System.out.println("Verilen metin palindrom");
        }else{
            System.out.println("Verilen metinn palindrom degil");
        }

    }

}
