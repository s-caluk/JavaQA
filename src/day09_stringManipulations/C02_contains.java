
/*
ctrl+f islemini yapiyor. metin x´i iceriyor mu gibi.
Stringden konusuyorsak kesinlikle case sensitive
 */

package day09_stringManipulations;

public class C02_contains {
    public static void main(String[] args) {

        String str = "Java ogren, mutlu ol";
        System.out.println(str.contains("mutlu"));   //true, str mutlu iceriyor mu? t/f

        //charSequence : char dizisi
        System.out.println(str.contains("j"));       //false
        System.out.println(str.contains(" "));       //true

        // contains method'u kactane olduguna degil,
        // sadece var olup olmadigana bakar

        System.out.println(str.contains("Java") && str.contains("mutlu"));  //true

    }
}
