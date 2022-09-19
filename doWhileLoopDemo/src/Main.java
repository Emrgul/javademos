public class Main {

    public static void main(String[] args) {

        int i = 1;
// Do - while
        // normalde while döngüsünde şart şağlanmazsa kod bloğu çalışmazdı.
        // ancak do-while'da şart uymasa bile çalışacaktır.
        do {
            System.out.println(i);
            i+=2;
        } while (i < 10);

    }
}
