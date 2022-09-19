public class Main {

    public static void main(String[] args) {

        int i=1;

        while (i<10){
            // eğer ben bu dönüyü çalıştırısam infinite loop dediğimiz yapıyla karşılaşırız.
            // bizim burda for döngüsünde yaptığımız gibi i'yi arttırmamız gerekir.
            System.out.println(i);
        }

        while(i<10){

            i++;
            System.out.println(i);

        }

    }
}
