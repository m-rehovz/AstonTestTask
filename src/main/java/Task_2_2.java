import java.util.Scanner;


public class Task_2_2 {


    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        System.out.println("Введите две строки: ");
        String a = newScan.nextLine();
        String b = newScan.nextLine();
        compare_strings(a, b);
    }


    static void compare_strings(String a, String b) {
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }


}
