
/*
interfaceler bir sekil sablondur, to do list gibi. bodyleri yoktur.
 */

package day30_interfaces_iterator;

public interface I01_Interface {
    //tüm metodlar public ve abstractir
    //interfacelerde tüm variableler public , static ve final´dir
    //final oldugundan sonradan deger atamak mümkün olmaz, olustururken deger ATANMALIDIR

    int SAYI =10;         //final oldugundan büyük harf tercih edilir
    public static final String OKUL_ISMI = "Yildiz Koleji";
    public int SAYI2 = 20;

    void method1();
    public int method2();
    abstract String method3();
    public abstract void method4();
    void method5();

    /*
    bir interface´e sonradan bir method eklemek istedigimizde o interface´i daha once implement eden
    tüm classlar yeu eklenen methodu implement etmek zorunda olur.

    Javaya yapilan talepler sonucunda JAva8 ile birlikte bir istisna getirilmis.
    eger sonradan eklenen methodun tüm eski classlar tarafindan implement edilme mecburiyeti
    olmasin istiyorsaniz yeni olusturdugunuz methoda default veya static keyword ekleyip body de olusturursaniz
    o zaman bu methodun child classlar tarafindan implement edilme mecburiyeti olmaz.
     */
    public default  void method44(){
        System.out.println("interfaceki default olarak isaretlenen method calisti");
    }

    public static  void method34(){
        System.out.println("interfaceki static olarak isaretlenen method calisti");
    }


}
