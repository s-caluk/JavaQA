package day07_ternary_switchStatements;

public class C04_Ternary {
    public static void main(String[] args) {

        /*Kullanicidan alinan deger
        100´den büyükse -> 2 ile carpin
        100´den kücükse -> sayiya 10 ekleyin
         */

        int input = 45;

        // if-else ile yapalim

        if (input>100){
            input *= 2;
        }else{
            input +=10;
        }
        System.out.println("if-else ile input : " + input);


        //Ternary ile yapalim
        input = 145;
        input = input>100 ? input*2 : input+10;
        System.out.println("ternary ile input : " + input);

    }
}
