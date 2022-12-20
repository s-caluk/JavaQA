package day21_staticKeyword;

public class C03_PassByValue {
    public static void main(String[] args) {
        int sayi = 20 ;
        int s = 20 ;
        System.out.println(s);
        //int sayi = 30;
        //String sayi = "Hasan";

        // bir scope´da tanimlanan variable´in yeniden tanimlanma imkani yoktur
        // data türünü degissen de yeniden tanimlanamiyor! aksi halde
        // sayi variablesini kullanirken hangisini kullanancagi mechul olur

        method1();  //bütün s´lerin birbirinden bagimsiz olduguna dikkat et
    }

    public static void method1(){
        method2(5);
        String s = "Hasan";
        System.out.println(s.toLowerCase()); //hasan
    }

    public static void method2(int s){
        s = s*s;
        System.out.println(s);
    }
}
