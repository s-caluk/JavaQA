package day12_methodCreation;

public class C03_AsalSayi {
    public static void main(String[] args) {

        //verilen bir sayinin asal olup olmadigini true/false olarak döndüren bir method olusturun

        System.out.println(asalSayiMi(7)); //true   sonucu almak icin ya yazdiracagiz

        boolean sonuc= asalSayiMi(15 );     //false   ya da atama yapacagiz
        System.out.println(sonuc);
    }

    public static boolean asalSayiMi(int a) {

        boolean asalSayi = true;

        for (int i = 2; i < a; i++) {

            if (a % i == 0) {                //if else yi baska mantikla yapti
                asalSayi = false;
                break;
            }
        }
        return asalSayi;
    }

}
