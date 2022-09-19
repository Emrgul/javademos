public class Main {

    public static void main(String[] args) {

        // 3 elemanlı students array'i oluşturduk.
        String[] students = new String[3];

        // javada indexler 0'dan başlar.

        students[0] = "Engin";
        students[1]="Emre";
        students[2]="Buket";

        for (int i = 0 ; i< students.length ; i++){

            System.out.println(students[i]);
        }

        System.out.println("-----------------------------------------------------------------------");
       //  students arrayindeki student'ları al
       // students arrayindeki her bir elemanı gez
       // her bir elemanı gezerken o anki elemana takma isim veririz.
       // Biz burada student verdik.
        for (String student : students){
            System.out.println(student);
        }

    }
}
