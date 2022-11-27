package day09_stringManipulations;

public class C08_lastIndexOf {
    public static void main(String[] args) {

        String str = "Javayi iyi ogrenmek icin cok calismam lazim cok";

        //ilk a nin indexini yazdiralim
        System.out.println(str.indexOf("a"));

        //son a nin indexini yazdirin
        System.out.println(str.lastIndexOf("a"));

        //15. indexden önce ve sonra ilk a´yi arayalim
        System.out.println(str.lastIndexOf("a", 15));  //15 den önce(lastIndexof)
        System.out.println(str.indexOf("a",15));       //15 den sonra(indexOf)

        //verien str da cok kelimesinin kullanimini kontrol edip
        // - cok kelimesi kullanilmamis
        // - bir kere kullanilmis
        // - birden fazla kullanilmis
        //sonuclarindan uygun olani yazdirin

        int ilkCokIndexi = str.indexOf("cok");
        int sonCokIndexi = str.lastIndexOf("cok");

        if(!str.contains("cok")) {
            System.out.println("cok kelimesi kullanilmamis");
        } else if (ilkCokIndexi == sonCokIndexi) {
            System.out.println("cok kelimesi bir kere kullanilmis");
        }else{
            System.out.println("cok kelimesi birden fazla kullanilmis");
        }

    }
}
