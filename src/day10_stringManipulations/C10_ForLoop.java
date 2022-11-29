

package day10_stringManipulations;

public class C10_ForLoop {
    public static void main(String[] args) {

        // input olarak verilen sayidan baslayip
        // 7'ser 7'ser artirarak input olarak verilen bitis sayisina kadar
        // - tum sayilari
        // - kac adet sayi oldugunu
        // - ve bu sayilarin toplaminin kac oldugunu yazdirin

        int inputBaslangic = 34;
        int inputBitis = 563;
        int toplam = 0;
        int sayac = 0;
        //soruya baslamadan önce ihtiyacin olan malzemeleri tamamlaman lazim

        for (int i = inputBaslangic; i <= inputBitis ; i+=7) {
            System.out.print(i+" ");      //tum sayilari yazdir
            sayac++;                      //adedini yazdirmak icin
            toplam += i;                  //toplamlari yazdirmak icin
        }
        System.out.println(" ");
        System.out.println("Toplamda "+ sayac +" adet sayi var. \nBu sayilarin toplami: " + toplam);


    }
}
