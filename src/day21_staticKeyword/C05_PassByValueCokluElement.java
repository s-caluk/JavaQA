
package day21_staticKeyword;

import java.util.Arrays;

public class C05_PassByValueCokluElement {
    public static void main(String[] args) {
        // bir method olusturup, arr'yi method'a yollayalim
        // method'da arr'in elementleri uzerinde degisiklik yapalim ve arr'yi yazdiralim

        int[] arr = {3,6,9,1,7};
        elementleriDegistir(arr);
        System.out.println(Arrays.toString(arr)); //[13, 6, 19, 1, 7] coklu elementde degisiklik kalici oldu


    }
     public static void elementleriDegistir(int[] b ){
        //arr ve b zeiger´leri heap memorydeki ayni wohnungu gösteriyor gibi düsün
        b[0] = 13;
        b[2] = 19;
         System.out.println(Arrays.toString(b));   //[13, 6, 19, 1, 7]
     }
}
