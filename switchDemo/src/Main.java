public class Main {

    public static void main(String[] args) {
        char grade = 'D';

        switch (grade) {

            case 'A':
                System.out.println("Mükemmel geçtiniz.");
                break;
            case 'B':
                System.out.println("İyi geçtiniz");
                break;
            case 'C':
                System.out.println("ortalama geçtiniz");
                break;
            case 'D':
            case 'F':
                System.out.println("kaldınız");
                break;
                //Belirtilen durumlardan farklı bir durum belirtirse default yazıp belirleriz.
            default:
                System.out.println("Geçersiz not girdiniz.");

        }

    }
}
