


package day10_stringManipulations;

public class C03_replaceAll {

    public static void main(String[] args) {

        //bu metindeki sayilardan kurtulun---------------------------------------------
        String str= "J6a1va 566G1uz6,z1e6l-d61ir1";

        System.out.println(str.replace("1","")
                .replace("5","")
                .replace("6","")); // Java Guz,zel-dir


        //bunu nasil degistireceksin? tek tek zahmetli is------------------------------
        str = "Ja7va,; og436ren,./dikce guzelle=-098siyor";
        /*
           replace() zaten istenen degisikligi verilen ozellige uyan tum degerler icin yapar
           eger genellemeyi butun sayilari, butun space'leri, butun ozel karakterleri
           gibi genisletmek istersek replace() yerine replaceAll() kullaniriz
           Java bu genellemeleri yazabilmemiz icin regex(regular expressions) tanimlamistir
           \\d : butun digit'ler
         */

        //sayilardan kurtariyor-------------------------------------------------------
        str = str.replaceAll("\\d","");
        System.out.println(str);                                      //Java,; ogren,./dikce guzelle=-siyor

        //özel karakterlerden kurtul---------------------------------------------------
        //sadece rakam ve harfler kalsin istiyorsan, disindakileri at:\\W
        // space de ozel karakter oldugundan bu durumda space'in yok olmamasi icin
        // once space yerine metinde olmayan bir deger atayalim

        str = str.replace(" ", "5");
        str = str.replaceAll("\\W","");
        str = str.replace("5"," ");
        System.out.println(str);

        // buradaki harf sayisini bulun-----------------------------------------------
        String input3="Ali Can, Merve Star, Mark Tom";

        input3=input3.replaceAll("\\W","");
        System.out.println(input3.length()); // 22



    }
}
