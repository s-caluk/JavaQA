


package day07_ternary_switchStatements;

public class C07_NestedTernary {
    public static void main(String[] args) {

        /*
        Kullanicidan bir tam sayi alin
        sayi pozitifse -> cift sayi veya cift sayi degil seceneklerinden uyygun olani yazdirin
        sayi pozitif degilse -> 3 basamakli veya 3 basamakli degil diye uygun olani yazdirin
         */

        int sayi=-709;
        System.out.println(sayi>0
                ?
                sayi%2==0 ? "cift sayi" : "tek sayi"
                :
                -100>=sayi && sayi>=-999 ? "3 basamakli" : "3 basamakli degil");

        System.out.println(sayi>0 ? sayi%2==0 ? "cift sayi" : "tek sayi" :-100>=sayi && sayi>=-999 ? "3 basamakli" : "# basamakli degil");
    }
}
