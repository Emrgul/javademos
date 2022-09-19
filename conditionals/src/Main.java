public class Main {

    public static void main(String[] args) {

        int sayi = 10;

        if(sayi<20) {

            // şart blogu doğruysa süslü parantezin içini çalıştır.
            System.out.println("Sayi 20'den küçüktür");
        }

        if (sayi<15){
            System.out.println("Sayi 15'den küçüktür");
        }

// burada ya if bloğunun içindeki ifade çalışır ya da else bloğunun içindeki ifade
// yani iki bloktan biri çalışmak zorundadır.
        if(sayi<20){
            System.out.println("sayi 20'den küçüktür");
        }else {
            System.out.println("sayi 20'den büyüktür.");
        }

// if else if()

        if(sayi<20){
            System.out.println("sayi 20'den küçüktür");
        }else if(sayi==20){
            // tek eşittir sayıya değer atamak demektir.
            // çift eşittir eşit mi anlamında kullanılır.
            System.out.println("sayi 20'ye eşittir");
        }else {
            System.out.println("sayi 20'den büyüktür.");
        }

    }
}
