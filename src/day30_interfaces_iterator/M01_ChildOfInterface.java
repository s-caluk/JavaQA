package day30_interfaces_iterator;

public class M01_ChildOfInterface implements I01_Interface, I02_interface{

    public static void main(String[] args) {
        System.out.println(I01_Interface.SAYI2);

        I01_Interface.method34();  //static olana böyle de ulasilabilir.

        M01_ChildOfInterface obj = new M01_ChildOfInterface(); //default olana obje üzerinden ulasilir
        obj.method44();
    }



    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }

    @Override
    public int method6() {
        return 0;
    }
}
