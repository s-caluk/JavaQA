
/*
Ne zaman static block kullanilir?
diyelim sisteme giris yapmak icin, kullanicidan sifre alman gerekiyor.
yani maine dokunmadan önce sifresini/bilgisini/formulunu aliyorsun gibi...
Static blocklar class´daki tüm yapilardan (main dahil) önce calisir
birden cok Static block olursa önce yukaridaki calisir.

static block'da istedigimiz bir variable'a baslangic degerinin atanmasi
kullanicidan yetki sorgulamasi gibi islemler yapilabilir
main method calismadan once yapilmasi gereken islem oldugunda kullanilir
 */
package day21_staticKeyword;

public class C01_StaticBlocks {
    C01_StaticBlocks() {
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("Main method calismaya basladi");  //3. burasi calisir
    }

    static {
        System.out.println("yukaridaki Static block calisti");     //1. burasi calisir
    }
    static {
        System.out.println("asagidaki Static block calisti");     //2. burasi calisir
    }
}
