

package day10_stringManipulations;

public class C08_ForLoop {
    public static void main(String[] args) {
        // 1 ile 1000 arasindaki sayilari(sinirlar dahil) yanyana yazdirin
        // yazdirma islemi bittiginde
        // "tum bu sayilarin toplami = " deyip sayilarin toplamini yazdirin

        int sayilarToplami = 0;

        for(int i=0; i<=100; i++){
            System.out.print(i + " ");
            sayilarToplami += i;
        }
        System.out.println(" ");  //alt satira gecsin diye yaptik
        System.out.println("Sayilar toplami: " + sayilarToplami);


    }
}
