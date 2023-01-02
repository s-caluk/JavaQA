package day27_overriding;

public class EParent extends DGrandParent{


    @Override
    protected void method1() {   //bunu code>generateY>overriding otomatik yaptik
        System.out.println("P method1");
    }
    // @override notasyonu overridden method ile overriding method'u ilisiklendirir
    // eger overriden method'da bu iliskiyi bozacak bir degisiklik yapilirsa
    // @override CTE verir

    protected void method2() {    //bunu manuel overriding yaptik
        System.out.println("P method2");
    }
    protected void method3() {
        System.out.println("P method3");
    }
}
