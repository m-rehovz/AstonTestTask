import java.util.Scanner;


public class Task_2_1 {


    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int a = newScan.nextInt();
        int b = newScan.nextInt();
        compare_numbers(a, b);
        math_operations(a, b);
    }

    static void compare_numbers(int a, int b) {
        if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a = b");
        }
    }


    static void math_operations(double a, double b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
    }


}
