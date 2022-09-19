public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[]{1,2,5,7,8,0,9};

        int aranacak=99;
        boolean var = false;

        for (int number:numbers){

            if (aranacak==number){
                var = true;
                break;
            }
        }

        if (var){
            System.out.println("aranacak sayı bulundu");

        }else{
            System.out.println("aranacak sayı bulunamadı");
        }

    }
}
