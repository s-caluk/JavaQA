

/*
        bir method ancak method call yapildiginda calisir
        method call icin method adi ve parametrelere uygun argument yazilmalidir
        method call icinde yazilan veriable veya degerlere argument denir
        argument ve parametreler uyumlu degilse CTE olur
 */

package day12_methodCreation;

public class C02_MethodOlusturma {
    public static void main(String[] args) {

        // verilen 2 sayiyi carpip sonucu yazdiran bir method olusturun


        carpYazdir(3,5);
        carpYazdir(6, 8);

    }
    public static void carpYazdir(int a,int b){
        System.out.println(a*b);
    }
}
