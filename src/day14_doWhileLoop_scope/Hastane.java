
/*
static kelimesi hastaneye özel veri mi  , kisiye özel veri mi onu belirliyor.
hastane verisi ise static , kisiye özel ise instance denir.
hastane verileri tüm objeler icin ortaktir , ayri ayri atamaya gerek yok. (oop konsept)

siz new ile hastane objesi olusturdugunuzda, otomatik olarak java instance verileri null diye atama yapar.
p1. deyince tüm verileri otomatik geliyor.
 */

package day14_doWhileLoop_scope;

public class Hastane {

    static String hastaneismi="Yildiz Hastanesi";
    static String hastaneAdres="Cankaya/Ankara";

    String personelIsmi;
    String personelAdresi;
    String personelTel;



    public static void main(String[] args) {

        Hastane p1= new Hastane();
        p1.personelIsmi="Kemal";


        Hastane p3= new Hastane();
        p3.personelTel="3121232323";
    }
}