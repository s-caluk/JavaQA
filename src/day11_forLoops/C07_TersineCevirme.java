
//indexteki harfi hem substring ile hem de chatAt() ile alabilirsin.

package day11_forLoops;

public class C07_TersineCevirme {
    public static void main(String[] args) {

        // Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

         String str = "Java ögrenmek icin cok calismak lazim";
         String tersStr = "";

         for(int i = str.length()-1; i >= 0; i-- ){

            tersStr += str.substring(i,i+1);
         }
        System.out.println(tersStr);

    }
}
