

package day27_overriding;

public class CAvciKuslar extends BKuslar{
    protected void hareket( ){
        System.out.println("ucarlar");
    }
    protected void beslenme( ) {
        System.out.println(" et yerler");
    }
    protected void pence( ) {
        System.out.println("pencelidir");
    }
    protected void gaga( ) {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {

        CAvciKuslar krt1 = new CAvciKuslar();  //datatürü ile construktor ayni ise kolay

        krt1.hareket();   //c
        krt1.beslenme();  //c
        krt1.pence();     //c
        krt1.gaga();      //c
        krt1.kanat();     //b
        krt1.solunum();   //b   a ´daki solunumu overrid etti
        krt1.cogalma();   //b   a ´daki solunumu overrid etti
        krt1.omur();      //a

        //eger const ile datatürü ayni ise özelligin veriable veya method olmasina bakilmaksizin
        //o classa gidilir, o class veya parent class´larda bulunan ILK DEGER kullanilir

        BKuslar krt2 = new CAvciKuslar(); //datatürü ve const farkli ise

        krt2.hareket();   // A da bulduk fakat asagi dogru override edilmismi diye bakiyoruz. C den aliyoruz!!
        krt2.beslenme();  // A da bulduk fakat asagi dogru override edilmismi diye bakiyoruz. C den aliyoruz!!
        krt2.pence();     // B de ve parents classlarda yok. CTE verir. bulsaydik overrid edilmismi diye bakiyoruz
        krt2.gaga();      // B de bulduk fakat C de overrid edilmis
        krt2.kanat();     // B
        krt2.solunum();   // B
        krt2.cogalma();   // B
        krt2.omur();      // C

        //hareket() metodunu önce datatüründe(B) ariyor. A da buluyor.
        //fakat construktor(C) kadar iniyor override edilmisse onu aliyor !
    }
}
