package day17_arrays;

import java.util.Arrays;

public class C01_binarySearch {
    public static void main(String[] args) {

        int[] arr = {2,8,4,1,9,3,6};
        System.out.println(Arrays.binarySearch(arr, 2)); //-5 hatali sonuc veriyor

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));  //[1, 2, 3, 4, 6, 8, 9] sonucun dogru cikmasi icin önce siraliyoruz

        System.out.println(Arrays.binarySearch(arr, 2)); //1
        System.out.println(Arrays.binarySearch(arr, 8)); //5

        //Olmayan bir element aradigimizda ne olur? IndexOf´la arama yaparken yoksa -1 dönüyordu.

        System.out.println(Arrays.binarySearch(arr, 0)); //-1 , hem yok diyor hemde olsaydi -1 de olurdu diyor
        System.out.println(Arrays.binarySearch(arr, 5)); //-5 , yok ama olsaydi -5 de olurdu
        System.out.println(Arrays.binarySearch(arr, 18)); //-8 , yok ama olsaydi -8 de olurdu demek istiyor

        /*
        Olmayan bir elementi binarySearch ile aratirsaniz
        once listede olsaydi, kacinci sirada olurdu sorusunun cevabini bulur
        olmadigini belirtmek icin basina - koyar
         */

        System.out.println(Arrays.binarySearch(arr, 7)); //-6 yok ama olsaydi 6. indexde olurdu

    }
}




