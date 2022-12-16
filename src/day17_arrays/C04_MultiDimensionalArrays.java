package day17_arrays;

import java.util.Arrays;

public class C04_MultiDimensionalArrays {
    public static void main(String[] args) {

        int[][] arr = {{1,2}, {3,4,5}, {6,7,4,5}, {2}, {1,2,3,4,5}};

        System.out.println(arr.length);    //5
        System.out.println(arr[2].length); //4
        System.out.println(arr[2][1]);     //7

        System.out.println(arr[3]);        //  [I@4c203ea1 referansin ciktisini verir!

        // Multi dimensional array ile calisirken dikkat etmemiz gereken en onemli konu
        // yazdigimiz kodun bir array mi yoksa yazdirabilecegimiz bir element mi döndürdüğüdür

        System.out.println(Arrays.toString(arr[3])); //[2]  bu "arrayin" kendisini yazdirir
        System.out.println(arr[3][0]); //2 bu "elementin" kendisini yazdirdi!

        // MDA'in tumunu yazdirmak isterseniz
        // tek katli arrayleri yazdirmak icin kullandigimiz yontem yeterli olmaz

        System.out.println(Arrays.toString(arr)); // [[I@4c203ea1, [I@27f674d, [I@1d251891, [I@7c75222b, [I@48140564]

        System.out.println(Arrays.deepToString(arr)); // [[1, 2], [3, 4, 5], [6, 7, 4, 5], [2], [1, 2, 3, 4, 5]]




    }
}
