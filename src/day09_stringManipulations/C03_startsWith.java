package day09_stringManipulations;

public class C03_startsWith {
    public static void main(String[] args) {

        String str = "Java mutluluktur";
        System.out.println(str.startsWith("Java"));        //true , str Java ile baslar?
        System.out.println(str.startsWith("j"));           //false
        System.out.println(str.startsWith("Java mutluluktur"));  //true
        System.out.println(str.startsWith(""));            //true , hiclikle baslar!

        System.out.println(str.startsWith("mutlu", 5)); //true
        System.out.println(str.startsWith("va", 2));    //true

        //System.out.println(str.startsWith('v', 2)); //char kabul etmiyor, hata!


    }

}
